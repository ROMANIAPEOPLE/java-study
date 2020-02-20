package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
	public static void main(String[] args) {
		Object [] objArr = {"1", new Integer(1), "2","2","3","3","4","4","4"};
		Set set = new HashSet();

		for(int i=0; i<objArr.length; i++) {
			set.add(objArr[i]);
		}
		
		System.out.println(set);
		//new Integer(1) 은 String이 아니므로 중복으로 간주하지 않는다.
	}
}
