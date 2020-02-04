package step1_객체지향언어.멤버간의_참조와_호출;

public class TvTest2 {

	
	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1 의 채널은 " +  t1.channel + "입니다.");
		System.out.println("t2 의 채널은 " +  t2.channel + "입니다.");
		
		t1.channel = 11; 
		
		System.out.println("t1 의 채널은 " +  t1.channel + "입니다.");
		System.out.println("t2 의 채널은 " +  t2.channel + "입니다.");
		
	}
}
