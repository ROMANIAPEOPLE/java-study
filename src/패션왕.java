import java.util.HashMap;
import java.util.Map;

public class 패션왕 {
	public int solution(String[][] clothes) {
		int result=1;
		Map<String, Integer> map = new HashMap<String, Integer>();

		for(int i=0; i<clothes.length; i++) {
			Integer count = map.get(clothes[i][1]);
			map.put(clothes[i][1], count==null ? 1 : count+1);
		}
		
		for(String key : map.keySet()) {
			result *= (map.get(key)+1);
		}

		return result-1;
	}
}
