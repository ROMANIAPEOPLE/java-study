package sm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int [] N = new int[Integer.parseInt(input.split(" ")[0])];
		int K = Integer.parseInt(input.split(" ")[1]);
		
		input =br.readLine();
		String [] str = input.split(" ");
		
		for(int i=0; i<N.length; i++) {
			N[i] = Integer.parseInt(str[i]);
		}
	}
}
