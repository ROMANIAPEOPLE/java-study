package ��������2017;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Example7 {

	static void solution(List<Integer> a) {
//���1. ���ͷ�����
//		Iterator<Integer> value = a.iterator();
//		while(value.hasNext()) {
//			Integer list = value.next();
//			if(list % 2 ==0 || list %3 ==0) {
//				value.remove();
//			}
//		}

		//���2. ����Ʈ ����
		List<Integer> list = new ArrayList<Integer>();
		for(Integer i : a) {
			if(i % 2 ==0 || i%3 ==0) {
				list.add(i);
			}
		}
		
		a.removeAll(list);
		
		
		
	}

	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < 30; ++i)
			a.add(random.nextInt(8) + 1);
		System.out.println(a.toString());
		solution(a);
		System.out.println(a.toString());
	}
}
