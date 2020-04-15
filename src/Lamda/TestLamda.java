package Lamda;

interface PrintString{
	void showString(String str);
}


public class TestLamda {

	public static void main(String[] args) {
		PrintString str = s->System.out.println(s);
		str.showString("test");
		showMyString(str);
	
	}
	
	
	public static void showMyString(PrintString p) {
		p.showString("Test2");
	}
	
	
}
