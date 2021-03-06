package G201432029;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example2 {

	static void add(List<Integer> list, int count) {
		// list 목록에 0부터 count 개의 정수를 추가한다.
		for (int i = 0; i < count; i++) {
			list.add(i);
		}

	}

	static void removeEven(List<Integer> list) {
		// list 목록에서 정수를 전부 제거한다.
		Iterator<Integer> v = list.iterator();
		while (v.hasNext()) {
			if (v.next() % 2 == 0) {
				v.remove();
			}
		}
		
		
	}

	static void addEven(List<Integer> list) {

		int count = list.size() *2;
		for(int i=0; i<count; i+=2) {
			list.add(i, i);
		}
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		add(list, 10);
		System.out.println(list.toString());

		removeEven(list);
		System.out.println(list.toString());

		addEven(list);
		System.out.println(list.toString());
	}
}
