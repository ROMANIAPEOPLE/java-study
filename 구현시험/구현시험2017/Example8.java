package 구현시험2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Example8 {

	static int solution(List<Integer> a) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int value : a) {
			Integer count = map.get(value);
			map.put(value, count == null ? 1 : count + 1);
		}
		int maxValue = 0, maxCount = 0;
		for (int value : map.keySet()) {
			if (map.get(value) > maxCount) {
				maxCount = map.get(value);
				maxValue = value;
			}
		}
		return maxValue;
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
//solution 메소드를 구현하시오.
//List a에 들어있는 정수들 중에서 가장 빈도수가 높은 정수를 리턴한다.
//Map을 사용해서 구현해야 한다.
