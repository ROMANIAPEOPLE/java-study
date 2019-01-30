package Map;

// Key값을 클래스로 사용할 경우, 이퀄스와 헤쉬 모두 재정의

import java.util.HashMap;
import java.util.Map;

public class Example04 {

	public static void main(String[] args) {
		Map<Person, Integer> map = new HashMap<Person, Integer>();
		map.put(new Person("홍길동", 18), 101);
		map.put(new Person("임꺽정", 19), 102);

		System.out.println(map.get(new Person("홍길동", 18)));
		System.out.println(map.get(new Person("임꺽정", 19)));
	}
}
