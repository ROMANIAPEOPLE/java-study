
package List;

import java.util.ArrayList;

public class oddNumber {
//<���ͷ����� ������ ���� Ȧ�� ����>
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

	
	// List �����ǽ�  1) Ȧ���� �����-size,get �޼ҵ带 ����Ͽ� ¦�� ����
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
		
		System.out.print("Ȧ�� ���� �� : " + arr.toString() + " ");
		oddRemove(arr);
		System.out.println();
		System.out.print("Ȧ�� ���� �� :" + arr.toString() + " ");
		
		

	}
}
