package stream;

import java.util.ArrayList;
import java.util.List;

public class exam2 {
	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		

		sList.stream().forEach(c -> System.out.println(c));
		
		sList.stream().sorted().forEach(c->System.out.println(c));
		
		sList.stream().map(s->s.length()).forEach(n-> System.out.println(n));
	
	}
}
