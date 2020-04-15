package Lamda;

public class TestStringConact {

	public static void main(String[] args) {
		StringConImpl impl = new StringConImpl();
		impl.makeString("hello", "hi");
		
		/////// 람다사용
		
		
		StringConact conact = (a,b) -> System.out.println(a + "," + b);
		conact.makeString("hello", "hi");
		
		StringConact conact2 = new StringConact() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+","+s2);
				
			}
		};
		
		conact2.makeString("dd", "ff");
	}
}
