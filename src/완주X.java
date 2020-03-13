import java.util.Arrays;

public class 완주X {
	public String solution(String[] participant, String[] completion) {
		Arrays.parallelSort(participant);
		Arrays.parallelSort(completion);
		
		int i;
		for(i=0; i<completion.length; i++) {
			if(!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		return participant[i];
	}
	
}
