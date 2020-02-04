package G201432029;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Example6 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] a = new int[20];
		for (int i = 0; i < a.length; ++i)
			a[i] = random.nextInt(5);
		// ±¸Çö
	
		Map<Integer, Integer> map = new HashMap<>();
		for(int i : a) {
			Integer count = map.get(i);
			if( count == null) count =0;
			++count;
			map.put(i, count);
		}
		for(int i : map.keySet())
			System.out.printf("%d=%d ", i,map.get(i));
	}
}
