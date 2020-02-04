package H201432029;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example1 {
	/*
	 * HashMap �� ����, �迭�� �ִ� ������ �ѹ��� put ���ش�. ���� �󵵼��� ���� key ���� value(count) ���� ����
	 * ũ�� ����ȴ�.
	 *
	 * keySet �޼ҵ带 ���� ��� key���� �ҷ��´�.
	 */
	// ���h 1��
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

	// ���� 2��


//	// ����2 : �迭�� �̿��� ����, �� value ���� ������ 0<=value < 10
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
