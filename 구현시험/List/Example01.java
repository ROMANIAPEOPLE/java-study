package List;

import java.util.ArrayList;
import java.util.List;

public class Example01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("one"); // collection interface �� ���� ��ӹ��� �޼ҵ�
		list.add("three"); //collection interface �� ���� ��ӹ��� �޼ҵ�
		list.add(0, "zero"); // List interface �� ����� �޼ҵ�
		list.add(2, "two"); // List interface�� ����� �޼ҵ�
		for (String s : list)
			System.out.printf("%s ", s);
		

	}
}
