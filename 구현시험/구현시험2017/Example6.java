package 구현시험2017;

import java.util.Arrays;
import java.util.Random;

public class Example6 {
/*
 * 배열 a에서, 2의 배수와 3의 배수를 제거해야 한다.
  배열의 원소가 제거되면, 그 뒤의 값들이 한 칸씩 앞으로 이동해야 한다.
  제거되고 남은 뒷 부분에 -1을 채워야 한다.

1. 2의 배수가 아니거나 3의 배수가 아니면  a 배열에 삽입
2. index까지는 2의 배수가 아니거나 3의 배수가 아닌 값들이 삽압되어 있으므로, index다음의 값을 -1로 채운다.
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
