package step1_객체지향언어.멤버간의_참조와_호출;

public class TvArrayTest {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];

		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10;
			// 객체배열은 하나하나 초기화해줘야한다.
		}

		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
		}
	}
}