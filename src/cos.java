import java.util.HashMap;
import java.util.Map;

public class cos {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<>();
		int[] arr = {3,5,7,9,1};
		boolean check =false;
		for (int key : arr) {
			Integer count = map.get(key);
			if (count == null)
				count = 1;
			else
				count++;
			map.put(key, count);
		}

		for (int key : map.keySet()) {
			if (map.get(key) != 1) {
				check = true;
				System.out.print(map.get(key) + " ");
			}

		}
		if(!check) {
			System.out.println(-1);
		}

	}

}
