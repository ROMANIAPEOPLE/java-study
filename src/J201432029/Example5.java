package J201432029;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example5 {

	static String[] convertToArray(String s) {

		
		ArrayList<String> list = new ArrayList<>();
		
		
		String regex = "[a-zA-Z]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		
		while(matcher.find()) {
		list.add(matcher.group(0).toLowerCase());	
		}
		
		String [] b = new String[list.size()];
		
		return list.toArray(b);
		
		
	}

	public static void main(String[] args) {
		String[] a = { "one 2 two, - Three,\t four; @ \t\nfive..,SIX)",
				"1 one 2 two, - Three,\t four; @ \t\nfive..,SIX)" };
		for (String s : a) {
			String[] t = convertToArray(s);
			System.out.println(Arrays.toString(t));
		}
	}
}
//[one, two, Three, four, five, SIX]
//[one, two, Three, four, five, SIX]

