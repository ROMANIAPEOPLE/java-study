package List;

import java.util.ArrayList;
import java.util.List;

//����Ʈ ������ ���� ¦�� ����

public class oddTest {

	static void oddRemove2(List<Integer> list) {
		ArrayList<Integer> odd = new ArrayList<Integer>();
		for(int i : list) {
			if(i %2 !=0) {
				odd.add(i);
			}
		}
		
		list.removeAll(odd);
	}
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++)
			a.add(i);
		
		System.out.println("¦�� ���� �� : " + a.toString() + " ");
		oddRemove2(a);
		System.out.println("¦�� ���� �� : " + a.toString());
		
	}
}
