package J201432029;

import java.util.ArrayList;
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


abstract class PersonComparator implements Comparator<Person>{
    public static final int ORDERBY_NAME = 0;
    public static final int ORDERBY_AGE = 1;
    public static final int ASC = 1;
    public static final int DESC = -1;
    
    int orderBy, asc;
    
    
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
		list.add(new Person("È«±æµ¿", 18));
		list.add(new Person("ÀÓ²©Á¤", 19));
		list.add(new Person("Àü¿ìÄ¡", 20));
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
