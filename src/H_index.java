import java.util.Arrays;

public class H_index {
	public int solution(int[] citations) {
		int answer = 0;
		Arrays.parallelSort(citations);
		for (int i = citations.length - 1; i >= 0; i--) {
			if (citations[i] < answer) {
				return answer;
			}
			answer++;
		}
		return answer;
	}
}
