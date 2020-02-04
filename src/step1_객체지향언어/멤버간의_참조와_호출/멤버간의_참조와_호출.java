package step1_객체지향언어.멤버간의_참조와_호출;

class TestClass {
	void instanceMethod() {}
	static void staticMethod() {}
	
	void instanceMethod2() {
		instanceMethod();
		staticMethod();
	}
	
	
	static void staticMethod2() {
//		instanceMethod();   에러 ,  static 메서드에서는 같은 class라도 인스턴스 메서드를 호출할 수 없다.
		staticMethod();
	}
	
}

////////////////////////////////////////////////////////////////////////////////////////////////

class TestClass2 {
	int iv;
	static int cv;
	
	
	void instanceMethod() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void staticMethod() {
//		System.out.println(iv);    에러. static 메서드에서는 인스턴스 변수를 사용할 수 없다.
		System.out.println(cv);
	}
}






public class 멤버간의_참조와_호출 {
	public static void main() {
		
	}
}
