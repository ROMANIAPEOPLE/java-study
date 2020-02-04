package List;

import java.util.ArrayList;
import java.util.List;

public class Example04 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("zero");
		list.add("one");
		list.add("two");
		list.add("three");

		System.out.println(list.indexOf("two"));  //2 
		System.out.println(list.indexOf("three")); //3
		System.out.println(list.indexOf("four")); // 없으면 -1 출력
	}
}
