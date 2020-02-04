package step1_객체지향언어.생성자;
//매개변수가 있는 생성자와 매개변수가 없는 생성자


class Data1 {
	int value;
}

class Data2 {
	int value;
	
	Data2(int x) {
		value = x;
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(10);
	}
}
