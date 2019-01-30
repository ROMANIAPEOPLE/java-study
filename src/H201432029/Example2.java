package H201432029;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example2 {
//		���� 1 : ���ͷ�����
//	static void solution(List<Integer> a) {
//		// ��� a���� 2�� ����� 3�� ����� ��� �����϶�
//		Iterator<Integer> it = a.iterator();
//		while(it.hasNext()) {
//		Integer v = it.next();
//		if( v % 2 ==0 || v%3==0) {
//			it.remove();  list.remove(); �� error
//		}
//			
//		}
//		
//	}
	
//	���� 2 : �ϳ��� List�� �߰��� ����  ������ ������ add�� ��,  List  a �� removeAll
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
	
	//���� 3 ://for each���� ����� Ž���ϸ� add/remove ����
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
