import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 음료수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			String input = br.readLine();
			Long N = Long.parseLong(input.split(" ")[0]);
			Long M = Long.parseLong(input.split(" ")[1]);

			Long sum = (N + M) / 12;
			Long season = N / 5;

			Long answer = sum > season ? season : sum;

			System.out.println(answer);

		}

	}

}
