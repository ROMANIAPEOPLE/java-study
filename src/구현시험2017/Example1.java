package 구현시험2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * 배열을 Arrays.asList 메소드를 사용하여 list로 변경한 후  
 * 콜렉션 인터페이스 메소드를 사용한다.
 */


public class Example1 {

	static List<String> solution(String[] a1, String[] a2, String[] a3) {

		List<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList(a1));
		list.retainAll(Arrays.asList(a2));
		list.retainAll(Arrays.asList(a3));
		
		return list;
		
		
	}

	public static void main(String[] args) {
		String[] a1 = { "A", "B", "D", "F", "G" };
		String[] a2 = { "B", "C", "F", "H", "I" };
		String[] a3 = { "B", "F", "G", "H", "I" };

		System.out.println(solution(a1, a2, a3));
	}
}
