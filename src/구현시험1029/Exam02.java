package ±¸Çö½ÃÇè1029;
import java.util.Arrays;
import java.util.Objects;

/*
 * Person classï¿½ï¿½ toStringï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ø¾ï¿½ï¿½Ñ´ï¿½.
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
		Person[] a = new Person[] { new Person("È«ï¿½æµ¿", 18), new Person("ï¿½Ó²ï¿½ï¿½ï¿½", 21) };

		System.out.println(toString(a));
	}
}
