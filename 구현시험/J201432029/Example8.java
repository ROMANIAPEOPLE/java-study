package J201432029;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Example8 {

	static int solution(List<Integer> a) {
		Map<Integer, Integer> map = new HashMap<>();
		int maxCount=0;
		int maxKey =0;
		
		for(int key : a) {
			Integer count = map.get(key);  //처음 map.get(key)를 하면 null
			if(count ==null) count =1; //count = 1이된다.
			count++;  //또는 count+1
			map.put(key, count);  //key 값에 count값을 저장 (맵은 키값 중복이 안되기 때문에 알아서 덮어씀)
		}
		
		for(int key : map.keySet()) {
			if(map.get(key) > maxCount) {
				maxCount = map.get(key);
				maxKey = key;
			}
		}
		
		return maxKey;

	}

	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < 20; ++i)
			a.add(random.nextInt(10) + 1);
		System.out.println(a.toString());
		int maxValue = solution(a);
		System.out.println(maxValue);
	}
}
