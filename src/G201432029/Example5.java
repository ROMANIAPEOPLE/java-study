package G201432029;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example5 {

	public static void main(String[] args) {
		String[] a1 = { "d", "a", "b", "a", "c", "a" };
		String[] a2 = { "b", "a", "f", "e", "b", "b" };
		// ±¸Çö
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		for(int i=0; i<a1.length; i++) {
			list.add(a1[i]);
		}
		for(int i=0; i<a2.length; i++) {
			list2.add(a2[i]);
		}
		
		list.removeAll(list2);
		
		System.out.println(list);
	}
}
