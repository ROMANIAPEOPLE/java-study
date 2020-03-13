import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
	 public int[] solution(int[] progresses, int[] speeds) {
		 Queue<Integer> q = new LinkedList<Integer>();
		 ArrayList<Integer> result = new ArrayList<>();
		 
		 for(int i=0; i<progresses.length; i++) {
			 q.add((100-progresses[i]) % speeds[i] == 0 ? (100-progresses[i]) / speeds[i] : (100-progresses[i]) / speeds[i]+1);
		 }
		 
		 int firstProgress = q.poll();
		 int count = 1;
		 
		 while(!q.isEmpty()) {
			 int nextProgress = q.poll();
			 
			 if(firstProgress >= nextProgress) {
				 count++;
			 }else {
				 result.add(count);
				 firstProgress = nextProgress;
				 count =1;
			 }
		 }
		 result.add(count);
		 
		 
		 int [] result2 = new int[result.size()];
		 
		 for(int i=0; i<result2.length; i++) {
			 result2[i] = result.get(0);
		 }
		 
		 return result2;
		 
		 
	 }
}
