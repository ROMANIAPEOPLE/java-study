package 강의자료;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ListTest {
	@Test
	public void noGenerics() throws Exception{
		ArrayList list = new ArrayList();
		list.add("this is string");
		list.add(1);
		list.add(new Position(1,2));
		
		String first = (String)list.get(0);
		int second = (int)list.get(1);
		Position third = (Position)list.get(2);
	}
	
}
