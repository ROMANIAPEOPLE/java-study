package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Bingo {
	public static void main(String[] args) {
		Set set = new HashSet();
//		Set set = new LinkedHashSet();

		int[][] map = new int[5][5];
		
		for(int i=0; set.size() <25; i++) {
			set.add((int)(Math.random()*50)+1+"");
		}
		
		Iterator it = set.iterator();
		
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map.length; j++) {
				map[i][j] = Integer.parseInt((String)it.next());
				System.out.print((map[i][j] <10 ? "  " : " ") + map[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
