package ±¸Çö½ÃÇè1029;

import java.util.Arrays;

public class Exam03 {

	static boolean compareIdentity(Person[] a1, Person[] a2) {
		//ï¿½Î°ï¿½ï¿½ï¿½ ï¿½ï¿½Ã¼ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½Ã¼ï¿½ï¿½ï¿½ï¿½
		return a1==a2;
	}

	static boolean compareEquality(Person[] a1, Person[] a2) {
		return Arrays.equals(a1, a2);
	}

	public static void main(String[] args) {
		Person[] a1 = new Person[] { new Person("È«ï¿½æµ¿", 18), new Person("ï¿½Ó²ï¿½ï¿½ï¿½", 21) };
		Person[] a2 = new Person[] { new Person("È«ï¿½æµ¿", 18), new Person("ï¿½Ó²ï¿½ï¿½ï¿½", 21) };

		System.out.println(compareIdentity(a1, a2));
		System.out.println(compareEquality(a1, a2));
	}
}
