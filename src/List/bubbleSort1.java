package List;

import java.util.Arrays;

/* 1 , 10 , 5 , 8 ,7, 6 , 4 ,3 ,2 , 
�ٷ� ���� ���� ���Ͽ�, ���� ���� ������ ������ ���
�ѹ� �ݺ��� ���� ū ���� �� �ڿ� ��ġ
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
