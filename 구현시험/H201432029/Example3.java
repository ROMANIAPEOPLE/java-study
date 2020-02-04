package H201432029;

import java.util.ArrayList;
import java.util.Arrays;

public class Example3 {

	static void solution(int[] a) {
		// �迭 a���� 2�� ����� 3�� ����� ��� �����ϰ�
		// ���ŵ� �׸��� �� �׸���� ������ ��ܾ� �Ѵ�.
		// ���ŵ� �׸� ������ ���� �迭 ���� ������ -1�� ä����
		int index =0;
		for(int i=0; i<a.length; i++) {
			if(a[i] % 2 !=0 && a[i] % 3 !=0) { // 2�� ����� �ƴϸ鼭 3�� ����� �ƴ� ������ a�迭�� �߰��Ѵ�.
				a[index] = a[i];
				index++;
			}
		}
		for(int i=index; i<a.length; i++) {
			a[i]=-1;
		}

	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 6, 1, 8, 9, 2, 2, 3, 5, 3, 1, 3, 7 };
		System.out.println(Arrays.toString(a));
		solution(a);
		System.out.println(Arrays.toString(a));
	}
}
