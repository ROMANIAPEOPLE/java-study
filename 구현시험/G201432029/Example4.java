package G201432029;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example4 {

	public static void main(String[] args) {
		String[] a1 = { "d", "a", "b", "a", "c", "a" };
		String[] a2 = { "b", "a", "f", "e", "b", "b" };
		// 구현

		List<String> list1 = Arrays.asList(a1); // 배열을 List로
		List<String> list2 = Arrays.asList(a2); // 배열을 List로
		List<String> list3 = new ArrayList<String>();
		
		for(String s : list1) {
			if(list2.contains(s)) {
				if(list3.contains(s)==false) {
					list3.add(s);
				}
			}
		}
	
		System.out.println(list3);
		
	}
}

//구현2
//ArrayList<String> list = new ArrayList<>();
//ArrayList<String> list2 = new ArrayList<>();
//ArrayList<String> list3 = new ArrayList<>(); // 최종
//for (String s : a1) { 
//	list.add(s);
//}
//for (String s2 : a2) {
//	list2.add(s2);
//}
//list2.retainAll(list);
//
//for (String s3 : list2) {
//	if (list3.contains(s3) == false) {
//		list3.add(s3);
//	}
//}
//System.out.println(list3.toString());