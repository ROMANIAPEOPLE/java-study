import java.util.Arrays;

public class K번째수 {
	public int[] solution(int[] array, int[][] commands) {
		int[] result = new int[commands.length];
		int[] temp = {};
		for (int x = 0; x < commands.length; x++) {
			temp = Arrays.copyOfRange(temp, commands[x][0] - 1, commands[x][1]);
			Arrays.parallelSort(temp);
			result[x] = temp[commands[x][2] - 1];

		}
		return result;
	}
}
