package List;

import java.util.ArrayList;
import java.util.List;

public class Example06 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("zero");
		list.add("one");
		list.add("two");
		list.add("three");

		list.set(2, "TWO");

		for (String s : list)
			System.out.printf("%s ", s);

	}
}
