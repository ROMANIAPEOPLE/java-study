package List;

import java.util.Arrays;

/* 1 , 10 , 5 , 8 ,7, 6 , 4 ,3 ,2 , 
바로 옆의 값과 비교하여, 작은 값을 앞으로 보내는 방법
한번 반복시 가장 큰 값이 맨 뒤에 위치
*/
public class bubbleSort1 {

	public static void main(String args[]) {
		int temp;
		int[] array = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };
		for(int i=0; i< array.length; i++) {
			for(int j =0; j<array.length-1-i; j++) {
				if(array[j] > array[j+1]) {
					temp  = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
					
			}
		}

		System.out.println(Arrays.toString(array));
		
	}

}
