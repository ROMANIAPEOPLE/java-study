import java.util.ArrayList;
import java.util.Queue;

class Truck {
	int tweight;
	int distance;
	
	public Truck(int tweight, int distance) {
		this.tweight=tweight;
		this.distance=distance;
	}
}


public class 트럭 {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		
		int capacity = weight;
		int time = 0;
		
		Queue<Truck> outList = new LinkedList<Truck>();
		ArrayList<Truck> inList = new ArrayList<Truck>();
		
		for(int value : truck_weights) {
			outList.add(new Truck(value,bride_length));
		}
		
		while(!(outList.isEmpty() && inList.isEmpty())) {
			time++;
			
			if(!inList.isEmpty() && inList.get(0).distance == 0) {
				capacity += inList.get(0).tweight;
				inList.remove(0);
			}
			
			if(!outList.isEmpty() && outList.peek().tweight <=weigth ) {
				capacity -= outList.peek().tweight;
				inList.add(outList.poll());
			}
			
			
			for(int i=0; i<inList.size(); i++) {
				inList.get(0).distance--;
			}
		}
		
		return time;
		
	}
}
