import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 유기농배추 {
	static int M,N,K;
	static int [][] cababage;
	static boolean [][] visit;
	static int [] dx = {0,1,0,-1};
	static int [] dy = {1,0,-1,0};
	static int count=0;

	public static void dfs(int x, int y) {
		visit[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int cx = x+dx[i];
			int cy = y+dy[i];
			
			if(cx>=0 && cy>=0 && cx<M && cy<N) {
				if(!visit[cx][cy] && cababage[cx][cy] == 1) {
					dfs(cx,cy);
				}
			}
			
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		while(tc-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M=Integer.parseInt(st.nextToken());
			N=Integer.parseInt(st.nextToken());
			K=Integer.parseInt(st.nextToken());
			
			cababage = new int[M][N];
			visit = new boolean[M][N];
			
			for(int i=0; i<K; i++) {
				st = new StringTokenizer(br.readLine());
				int p1 = Integer.parseInt(st.nextToken());
				int p2 = Integer.parseInt(st.nextToken());
				
				cababage[p1][p2] = 1;
				
			}
			
			
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++) {
					if(cababage[i][j] == 1 && !visit[i][j]) {
						dfs(i,j);
						count++;
					}
				}
			}
			
			System.out.println(count);
		}
		
	}
}
