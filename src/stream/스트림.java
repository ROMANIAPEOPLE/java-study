package stream;

import java.util.Arrays;
import java.util.List;

public class 스트림 {
	public static void main(String[] args) {
		
		//기존의 코딩 방식
		List<String> str = Arrays.asList("Hello", "Hi" ,"hohoho","goodBye","안녕");
		int count = 0;
		
		for(String s : str) {
			if(s.contains("o")) {
				count++;
			}
		}
		System.out.println("Count : " + count);
		
		//Stream 이용
		
		count =0;
		count = (int) str.stream().filter(s->s.contains("o")).count();	
		System.out.println("Count : " + count);
		
		
		int [] arr = {1,2,3,4,5};
		Arrays.stream(arr).reduce(0, (a,b)->a+b);
		//출력 : 15
		
		
	}

}
