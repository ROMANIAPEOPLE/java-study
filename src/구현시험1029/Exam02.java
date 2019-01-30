package 구현시험1029;

import java.util.Arrays;
import java.util.Objects;

/*
 * Person class�� toString�� �������ؾ��Ѵ�.
 */


class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	@Override
	public boolean equals(Object obj) {
	
		if((obj instanceof Person) == false) return false;
		
		else {
			Person p = (Person)obj;
			return Objects.equals(this.name, p.name) && this.age == p.age;
		}
		
	}

	@Override
	public String toString() {
		return "{" + '"'+ name +'"'+ "," + age + "}";
	}
	
	
	
}

public class Exam02 {

	static String toString(Person[] a) {
		return Arrays.toString(a);
		
	}

	public static void main(String[] args) {
		Person[] a = new Person[] { new Person("ȫ�浿", 18), new Person("�Ӳ���", 21) };

		System.out.println(toString(a));
	}
}
