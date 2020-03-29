package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

//가장 문자열이 긴 값을 반환

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		}
		else {
			return s2;
		}
	}
}

public class exam {

	public static void main(String[] args) {
		String[] str = { "안녕하세요-------", "hello", "Good morning", " 반갑읍니다" };
	
		
		System.out.println(Arrays.stream(str).reduce("", (s1,s2) -> {
			if(s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else {
				return s2;
			}
		}));
	
	
		System.out.println(Arrays.stream(str).reduce(new CompareString()).get());
		
		
	
	}
}
