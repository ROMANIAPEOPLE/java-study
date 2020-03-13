import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class XS {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int [] N = new int[Integer.parseInt(input.split(" ")[0])];
		int K = Integer.parseInt(input.split(" ")[1]);
		
		input = br.readLine();
		
		String [] Ninput = input.split(" ");
		
		for(int i=0; i<Ninput.length; i++) {
			N[i] = Integer.parseInt(Ninput[i]);
		}
		
		Arrays.parallelSort(N);
		
		int index=0;
		int answer =0;
		
		while(true) {
			answer++;
			if(index+K >= N.length) break;
			for(int i=0; i<K; i++) {
				N[index++] =N[0];
			}
			index--;
		}
		
		System.out.println(answer);
		
	}

}
