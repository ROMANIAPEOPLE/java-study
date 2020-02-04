package G201432029;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {
		String[] a = { "d", "a", "b", "a", "c", "d", "e", "f", "e" };
//		// ±¸Çö
//		ArrayList<String> list = new ArrayList<String>();
//		ArrayList<String> list2 = new ArrayList<String>();
//
//		for(int i=0; i<a.length; i++) {
//			list.add(a[i]);
//		}
//		
//		for(int i=0; i<list.size(); i++) {
//			if(!list2.contains(list.get(i)))
//				list2.add(list.get(i));
//		}
//		
//		System.out.println(list2);
		
		List<String> list = new ArrayList<String>();
		for(String s : a)
			if(list.contains(s)==false) {
				list.add(s);
			}
		
		System.out.println(list);
	}
}
