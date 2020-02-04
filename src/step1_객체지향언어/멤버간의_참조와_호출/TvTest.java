package step1_객체지향언어.멤버간의_참조와_호출;

/* 인스턴스는 참조변수를 통해서만 다룰 수 있으며, 참조변수의 타입은 인스턴스의 타입과 일치해야한다. */

class Tv {
	// Tv의 속성(멤버변수)
	String color;
	boolean power;
	int channel;

	// Tv의 기능(메서드)
	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}

public class TvTest {
	public static void main(String[] args) {
		Tv t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널 :" + t.channel);
	}
}
