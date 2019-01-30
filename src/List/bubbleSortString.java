package List;

import java.util.Arrays;

public class bubbleSortString {

	static void swap(String[] arr, int i, int j) {

		String temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void bubbleSort(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					swap(arr, j, j + 1);
				}
			}
		}

	}

	public static void main(String[] args) {
		String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };

		System.out.println(Arrays.toString(a));
		bubbleSort(a);
		System.out.println("bubleSort :" + Arrays.toString(a));
	}

}
