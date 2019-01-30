package Map;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/*
 * HashMap �� Key�� ������ Ŭ������ equals �޼ҵ� �Ӹ� �ƴ϶� hashCode �޼ҵ���� ������ ����� �Ѵ�.
 * public int hashCode()
 *  return Objects.hash(name,age) 
 *  -> �ܼ��� �Ű��������� ������ �ָ� �ȴ�.
 *  
 *  equals �޼ҵ� �����ǽ� 
 *  ������ ������ Objects.equals�� ���� ������.
 *  �⺻�ڷ�����  == 
 */


class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Person(\"%s\",%d)", name, age);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj) return false;
		if((obj instanceof Person) == false) return false;
		Person p = (Person) obj;
		return this.age == p.age && Objects.equals(this.name, p.name);
	}
	
	
}

public class Example01 {
	public static void main(String[] args) throws IOException {

		Map<Integer, Person> map = new HashMap<Integer, Person>();
		map.put(101, new Person("��޼�", 18));
		map.put(102, new Person("�蹮��", 20));
		
		System.out.printf("%s %s %s\n" , map.get(101) , map.get(102), map.get(103));
		
		map.remove(101);
		System.out.printf("%s %s %s\n" , map.get(101) , map.get(102), map.get(103));

		
		
	}

}
