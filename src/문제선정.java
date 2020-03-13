import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 문제선정 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		int[] N = new int[Integer.parseInt(input)];

		input = br.readLine();

		String[] arr = input.split(" ");

		for (int i = 0; i < N.length; i++) {
			N[i] = Integer.parseInt(arr[i]);
		}

		Arrays.parallelSort(N);
		
		int count =1;
		
		int temp = N[0];
		
		for(int i=0; i<N.length; i++) {
			if(temp !=N[i]) {
				count++;
			}
			
			else if(count == 3) {
				break;
			}
			
			temp = N[i];
		}
		if(count <3) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
		
	}
}
