package 구현시험1029;

import java.util.ArrayList;
import java.util.Collection;

public class Exam05 {

	
	static void removeEvenNumbers(Collection<Integer> c) {
		//占쏙옙占� 1 : 占쏙옙占싸울옙 ArrayList占쏙옙 占쏙옙占쏙옙占싹울옙, 짝占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙 占쏙옙 占쏙옙占쏙옙트占쏙옙 占쏙옙占쏙옙
		Collection<Integer> e = new ArrayList<Integer>();
		for(int i=0; i<c.size(); i++) {
			if(i % 2 ==0) {
				e.add(i);
			}
		}
		
		c.removeAll(e);
	}
	
	//占쏙옙占� 2 : 占쏙옙占싶뤄옙占쏙옙占쏙옙 
//	Iterator<Integer> v = c.iterator();
//	while(v.hasNext()) {
//		Integer list = v.next();
//		if(list % 2 ==0) {
//			v.remove();

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>();
		for (int i = 0; i < 10; ++i)
			c.add(i);
		removeEvenNumbers(c);
		System.out.println(c.toString());
	}
}
