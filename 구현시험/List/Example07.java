package List;

import java.util.ArrayList;
import java.util.List;

public class Example07 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("zero");
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");

		List<String> list2 = list.subList(1, 4);

		for (String s : list2)
			System.out.printf("%s ", s);

	}
}
