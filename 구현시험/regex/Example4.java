package regex;

public class Example4 {
	public static void main(String[] args) {
		String[] a = new String[] { "http://localhost:8080/test/list.jsp?pg=3&sz=15",
				"http://localhost:8080/test/list.jsp?pg=9&sz=10", "http://localhost:8080/test/list.jsp?pg=25&sz=20" };
		String regex = "pg=[0-9]+";

		//replaceAll : regex와 this 문자열이 일치하면 , "pg=1"로 그 부분을 전부 바꿔준다.
		
		for (String s : a) {
			String temp = s.replaceAll(regex, "pg=1");
			System.out.printf("%s => %s\n", s, temp);
		}
	}

}
