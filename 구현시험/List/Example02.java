package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example02 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		list1.add("one");
		list1.add("two");
		list2.add("zero");
		list2.add("three");
		list2.addAll(1, list1);
		for (String s : list2)
			System.out.printf("%s ", s);

		//list1  : one , two
		//list2  : zero , one, two ,three
		
	}
}
