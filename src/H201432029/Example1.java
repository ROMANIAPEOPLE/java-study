package H201432029;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example1 {
	/*
	 * HashMap 을 만들어서, 배열에 있는 값들을 한번씩 put 해준다. 가장 빈도수가 많은 key 값이 value(count) 값이 가장
	 * 크게 저장된다.
	 *
	 * keySet 메소드를 통해 모든 key값을 불러온다.
	 */
	// 구햔 1번
	static int solution(List<Integer> list) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int key : list) {
			Integer count = map.get(key);
			map.put(key, count == null ? 1 : count + 1);
		}
		int maxValue = 0, maxCount = 0;
		for (int key : map.keySet()) {
			if (map.get(key) > maxCount) {
				maxCount = map.get(key);
				maxValue = key;
			}
		}
		return maxValue;
	}

	// 구현 2번


//	// 구현2 : 배열을 이용한 구현, 단 value 값의 범위는 0<=value < 10
//	static int solution2(List<Integer> list) {
//		int[] count = new int[10];
//		int maxCount = 0;
//		int maxKey = 0;
//		for (int key : list) {
//			count[key] = count[key] + 1;
//			if (count[key] > maxCount) {
//				maxCount = count[key];
//				maxKey = key;
//			}
//		}
//		return maxKey;
//	}

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(new Integer[] { 1, 7, 1, 8, 5, 2, 2, 3, 5, 3, 1, 3, 7 });
		System.out.println(a.toString());
		int maxValue = solution(a);
		System.out.println(maxValue);
	}
}
