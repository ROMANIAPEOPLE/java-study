package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Telephone: 032-431-2323 010-5533-2299 02-555-3388 010-222-5678";
		String regex = "010-([0-9]{3,4})-([0-9]{4})";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		
		while(matcher.find()){
			System.out.println("전화번호 : " + matcher.group(0));
			System.out.println("국번 : " + matcher.group(1));
			System.out.println("번호 : " + matcher.group(2));
			
		}
	}

}
