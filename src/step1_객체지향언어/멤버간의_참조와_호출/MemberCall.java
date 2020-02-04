package step1_객체지향언어.멤버간의_참조와_호출;
public class MemberCall {
	int iv=10;
	static int cv=20;
	
	int iv2= cv;
//	static int cv = iv;  에러. 클래스 변수(static)는 인스턴스 변수를 사용할 수 없음.
	static int cv2 = new MemberCall().iv; // 굳이 사용하려면 이렇게 사용해야함.
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); // 에러. 클래스 메서드에서 인스턴스변수 사용불가.
		MemberCall c = new MemberCall();
		System.out.println(c.iv); // 객체 생성후 사용 가능.
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); //인스턴스 메서드에서는 인스턴스 변수를 바로 사용가능.
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1(); 에러. 클래스메서드에서는 인스턴스메서드를 사용할 수 없음.
		MemberCall c = new MemberCall();
		c.instanceMethod1(); // 인스턴스 객체 생성 후 사용가능.
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}	
}