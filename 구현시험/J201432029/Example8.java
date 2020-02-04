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
			Integer count = map.get(key);  //ó�� map.get(key)�� �ϸ� null
			if(count ==null) count =1; //count = 1�̵ȴ�.
			count++;  //�Ǵ� count+1
			map.put(key, count);  //key ���� count���� ���� (���� Ű�� �ߺ��� �ȵǱ� ������ �˾Ƽ� ���)
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
