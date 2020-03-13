import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class xd {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int answer = 1;
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int temp = N-K;
		int add = (temp/(K-1));
		
		if(temp%(K-1) != 0) {
			answer++;
		}
		
		answer+=add;
		System.out.println(answer);
		
		
	}
}
