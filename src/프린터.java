import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class printer {
	int docuNum;
	int pri;

	public printer(int docuNum, int pri) {
		this.docuNum = docuNum;
		this.pri = pri;
	}
}

public class 프린터 {
	public int solution(int[] priorities, int location) {
		Queue<printer> qu = new LinkedList<>();
		int result = 1;
		for (int i = 0; i < priorities.length; i++) {
			qu.add(new printer(i, priorities[i]));
		}

		while (!qu.isEmpty()) {
			printer document = qu.poll();
			boolean ck = true;
			Iterator it = qu.iterator();
			while (it.hasNext()) {
				printer value = (printer) it.next();
				if (value.pri > document.pri) {
					qu.add(document);
					ck = false;
					break;
				}
			}

			if (ck) {
				if (location == document.docuNum) {
					break;
				} else {
					result++;
				}
			}
		}
		return result;
	}
}