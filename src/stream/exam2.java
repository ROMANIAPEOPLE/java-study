package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class exam2 {
	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Tomas");
		sList.add("Tomas");
		

//		sList.stream().forEach(c -> System.out.println(c));
		
//		sList.stream().sorted().forEach(c->System.out.println(c));
		
//		sList.stream().map(s->s.length()).forEach(n-> System.out.println(n));
	
		sList.stream().distinct().forEach(s->System.out.println(s));
	
	}
}
