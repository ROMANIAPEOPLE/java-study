package 구현시험1029;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Exam06 {

	/*
	 * 파라미터로 주어진 목록 객체 c에 들어있지 않은 항목들을 this 객체에서 찾아서 전부 제거한다.
	 * 그래서 c에 들어있는 항목들만 this 객체에 남아있게 된다.
	 * 제거된 항목이 한 개 이상이면 true를 리턴한다.
	 */
	
	static void intersection(Collection<String> c1, Collection<String> c2) {
		c1.retainAll(c2);
	}

	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<String>();
		Collection<String> c2 = new ArrayList<String>();
		c1.addAll(Arrays.asList("a", "b", "c", "d"));
		c2.addAll(Arrays.asList("b", "d", "e", "f"));

		intersection(c1, c2);
		System.out.println(c1.toString());
	}
}
