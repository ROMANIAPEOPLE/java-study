import java.util.Arrays;

public class 전번 {
	public boolean solution(String[] phone_book) {
		Arrays.parallelSort(phone_book);
		boolean answer = true;
		for(int i=0; i<phone_book.length-1; i++) {
			if(phone_book[i+1].startsWith(phone_book[i])) {
				answer = false;
			}
		}
		
		return answer;
	}
}
