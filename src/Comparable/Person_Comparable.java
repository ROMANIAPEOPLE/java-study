package Comparable;

import java.util.Arrays;

public class Person_Comparable {
	public static void main(String[] args) {
		Person[] a = new Person[] { new Person("È«±æµ¿", 18), new Person("ÀÓ²©Á¤", 22), new Person("Àü¿ìÄ¡", 23) };

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
