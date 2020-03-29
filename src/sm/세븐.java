package sm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 세븐 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int N = Integer.parseInt(input);
		int[] value = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		int max = N / value[0];
		int index = 0;
		for (int i = 1; i < value.length; i++) {
			if (max <= N / value[i]) {
				max = N / value[i];
				index = i;
			}
		}

		int rem = max % value[index];
		boolean check = false;
		int maxRem = 0;
		for (int i = 0; i < value.length; i++) {
			if (rem >= value[i]) {
				check = true;
				maxRem = Math.max(maxRem, i);
			}
		}
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < max; i++) {
			builder.append(index);
		}

		if (check) {
			builder.append(maxRem);
		}

		System.out.println(builder);

	}
}
