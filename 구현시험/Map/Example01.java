package Map;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/*
 * HashMap 에 Key로 저장할 클래스는 equals 메소드 뿐만 아니라 hashCode 메소드까지 재정의 해줘야 한다.
 * public int hashCode()
 *  return Objects.hash(name,age) 
 *  -> 단순히 매개변수들을 나열해 주면 된다.
 *  
 *  equals 메소드 재정의시 
 *  참조형 변수는 Objects.equals가 가장 간편함.
 *  기본자료형은  == 
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
		map.put(101, new Person("김달섭", 18));
		map.put(102, new Person("김문섭", 20));
		
		System.out.printf("%s %s %s\n" , map.get(101) , map.get(102), map.get(103));
		
		map.remove(101);
		System.out.printf("%s %s %s\n" , map.get(101) , map.get(102), map.get(103));

		
		
	}

}
