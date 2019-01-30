package ��������2017;

import java.util.Arrays;
import java.util.Random;

public class Example6 {
/*
 * �迭 a����, 2�� ����� 3�� ����� �����ؾ� �Ѵ�.
  �迭�� ���Ұ� ���ŵǸ�, �� ���� ������ �� ĭ�� ������ �̵��ؾ� �Ѵ�.
  ���ŵǰ� ���� �� �κп� -1�� ä���� �Ѵ�.

1. 2�� ����� �ƴϰų� 3�� ����� �ƴϸ�  a �迭�� ����
2. index������ 2�� ����� �ƴϰų� 3�� ����� �ƴ� ������ ��еǾ� �����Ƿ�, index������ ���� -1�� ä���.
 */
	static void solution(int[] a) {
		int index=0;
		for(int i=0; i<a.length; i++) {
			if(a[i] % 2 !=0 && a[i] %3 !=0) {
				a[index++] = a[i];
			}
		}
		
		for(int i=index; i<a.length; i++) {
			a[i] = -1;
		}

	}

	public static void main(String[] args) {
		Random random = new Random();
		int[] a = new int[30];
		for (int i = 0; i < 30; ++i)
			a[i] = random.nextInt(8) + 1;
		System.out.println(Arrays.toString(a));
		solution(a);
		System.out.println(Arrays.toString(a));
	}
}
