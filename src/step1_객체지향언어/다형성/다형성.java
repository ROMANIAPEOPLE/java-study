package step1_객체지향언어.다형성;

class Tv {
	boolean power;
	int channel;

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
class CaptionTv extends Tv {
	String text;

	void caption() {
		// 내용생략 //
	}
}

public class 다형성 {
	public static void main(String[] args) {
		
		CaptionTv c = new CaptionTv();
		Tv t = new CaptionTv();
		
		
		// 조상 타입의 참조변수로 자손 인스턴스를 참조
		// 이 경우에는 CaptionTv의 모든 멤버를 사용할 수 없다.

	}
}
