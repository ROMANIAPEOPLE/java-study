package 구현시험1029;


public class Exam01 {
	public static double average(int... a) {
		int sum=0;
	
		for(int i: a) {
			sum += i;
		}
		
		return (double) sum / a.length;
	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5 };

		System.out.println(average(2, 3));
		System.out.println(average(2, 3, 4));
		System.out.println(average(a));
	}
}
//2.5
//3.0
//3.5
