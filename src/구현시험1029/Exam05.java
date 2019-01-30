package 구현시험1029;

import java.util.ArrayList;
import java.util.Collection;

public class Exam05 {

	
	static void removeEvenNumbers(Collection<Integer> c) {
		//��� 1 : ���ο� ArrayList�� �����Ͽ�, ¦���� ���� �� �� ����Ʈ�� ����
		Collection<Integer> e = new ArrayList<Integer>();
		for(int i=0; i<c.size(); i++) {
			if(i % 2 ==0) {
				e.add(i);
			}
		}
		
		c.removeAll(e);
	}
	
	//��� 2 : ���ͷ����� 
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
