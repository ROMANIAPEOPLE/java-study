
package List;

import java.util.ArrayList;

public class oddNumber {
//<이터레이터 구현을 통하 홀수 제거>
//	static void odd(LinkedList<Integer> l) {
//		Iterator<Integer> value = l.iterator();
//		while(value.hasNext()) {
//			Integer list = value.next();
//			if(list % 2 != 0) {
//				value.remove();
//			}
//		}
//		
//	}

	
	// List 구현실습  1) 홀수만 남기기-size,get 메소드를 사용하여 짝수 삭제
	static void oddRemove(ArrayList<Integer> array) {
		for(int i=0; i<array.size(); i++) {
			if(array.get(i) % 2 !=0) {
				array.remove(i);
			}
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<100; i++) {
			arr.add(i);
		}
		
		System.out.print("홀수 제거 전 : " + arr.toString() + " ");
		oddRemove(arr);
		System.out.println();
		System.out.print("홀수 제거 후 :" + arr.toString() + " ");
		
		

	}
}
