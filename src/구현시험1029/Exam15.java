package 구현시험1029;

import java.util.Arrays;

public class Exam15 {

	static void sort(int[] a) {
		Arrays.sort(a);
	}

	static int[] insert(int[] a, int value) {
		
		int [] copy = new int[a.length +1];
		if(Arrays.binarySearch(a, value) <0) {
			for(int i=0; i<a.length; i++) {
				copy[i+1] = a[i];
			}
			copy[0] = value;
			a=copy;
			Arrays.sort(a);
		}
		
		return a;
		
		
		
		
	}

	public static void main(String[] args) {
		int[] a = { 3, 8, 1, 2, 4, 5, 7 };

		sort(a);
		System.out.println(Arrays.toString(a));

		a = insert(a, 2);
		a = insert(a, 6);
		System.out.println(Arrays.toString(a));
	}
}
