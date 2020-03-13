package 강의자료;

public class Caculator {
	int add(int i, int j) {
		return i + j;
	}

	int subtrack(int i, int j) {
		return i - j;
	}

	int multiply(int i, int j) {
		return i*j;
	}
	
	int divide(int i, int j) {
		return i / j;
	}
	
	public static void main(String[] args) {
		Caculator cal = new Caculator();
		System.out.println(cal.add(3, 4));
		System.out.println(cal.subtrack(5, 4));
		System.out.println(cal.multiply(2, 6));
		System.out.println(cal.divide(8, 4));
	}
	
}
