package List;

import java.util.ArrayList;
import java.util.List;

public class Example01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("one"); // collection interface 로 부터 상속받은 메소드
		list.add("three"); //collection interface 로 부터 상속받은 메소드
		list.add(0, "zero"); // List interface 에 선언된 메소드
		list.add(2, "two"); // List interface에 선언된 메소드
		for (String s : list)
			System.out.printf("%s ", s);
		

	}
}
