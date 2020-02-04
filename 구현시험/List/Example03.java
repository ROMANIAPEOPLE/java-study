package List;

import java.util.ArrayList;
import java.util.List;

public class Example03 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("one");
		list.add("three");
		list.add(0, "zero");
		list.add(2, "two");

		//list : zero, one, two, three
		
		for (String s : list)
			System.out.printf("%s ", s);
		//zero , one ,two , three
		
		for (int i = 0; i < list.size(); ++i)
			System.out.printf("%s ", list.get(i)); //i번째 인덱스를 리턴 (List 인터페이스)
		// zero, one , two , three
	}
}
