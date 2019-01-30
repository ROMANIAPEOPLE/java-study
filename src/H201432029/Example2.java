package H201432029;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example2 {
//		구현 1 : 이터레이터
//	static void solution(List<Integer> a) {
//		// 목록 a에서 2의 배수와 3의 배수를 모두 제거하라
//		Iterator<Integer> it = a.iterator();
//		while(it.hasNext()) {
//		Integer v = it.next();
//		if( v % 2 ==0 || v%3==0) {
//			it.remove();  list.remove(); 는 error
//		}
//			
//		}
//		
//	}
	
//	구현 2 : 하나의 List를 추가로 만들어서  삭제할 값들을 add한 후,  List  a 에 removeAll
//	static void solution(List<Integer> a) {
//		ArrayList<Integer> remove = new ArrayList<Integer>();
//		
//		for(Integer i : a) {
//			if(i % 2 ==0 || i% 3 ==0) {
//				remove.add(i);
//			}
//		}
//		
//		a.removeAll(remove);
//		
//	}
	
	//구현 3 ://for each문을 사용해 탐색하면 add/remove 오류
	static void solution(List<Integer> a) {

		for(int i=0; i<a.size();) {
			int value = a.get(i);
			if(value % 2 == 0 || value % 3 == 0) {
				a.remove(i);
			}
			else
				i++;
		}
		
	}

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.addAll(Arrays.asList(new Integer[] { 1, 6, 1, 8, 9, 2, 2, 3, 5, 3, 1, 3, 7 }));
		System.out.println(a.toString());
		solution(a);
		System.out.println(a.toString());
	}
}
