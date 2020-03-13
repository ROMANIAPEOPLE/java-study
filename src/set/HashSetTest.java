package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("이순신");
		set.add("김유신");
		set.add("강감찬");
		set.add("이순신");
		
		System.out.println(set);
	
	/* -set은 중복을 허용하지 않는다.
	 * -출력 순서는 hash 내부 순서에 기준으로 한다.
	 */
	
	
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) { //  it의 다음 element가 있는가 ?
			String str = it.next();  //있다면 str에 저장
			
			System.out.println(str);
		}
		
	
	}
	
}
