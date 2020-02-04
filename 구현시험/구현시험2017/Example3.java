package 구현시험2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

}

public class Example3 {

	static void sort1(List<Person> list) {

	}

	static void sort2(List<Person> list) {

	}

	static void sort3(List<Person> list) {

	}

	static void sort4(List<Person> list) {

	}

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("홍길동", 18));
		list.add(new Person("임꺽정", 19));
		list.add(new Person("전우치", 20));
		sort1(list);
		System.out.println(list.toString());
		sort2(list);
		System.out.println(list.toString());
		sort3(list);
		System.out.println(list.toString());
		sort4(list);
		System.out.println(list.toString());
	}
}
