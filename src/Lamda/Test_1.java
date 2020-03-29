package Lamda;

public class Test_1 {
	public static void main(String[] args) {
		
		LamdaTest max = (x, y) -> (x>=y) ? x : y;
		System.out.println(max.getMaxNumber(10, 20));
	}
}
