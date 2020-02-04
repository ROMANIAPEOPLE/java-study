package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

// List�� ���� ������ ����
public class Example08 {

    static int getSum(List<Integer> list) { //List ��� ArrayList�� ����Ѵٸ� �������� ������� �ʾ� LinkedList�� ������ �� ���� �ȴ�.
        int sum = 0;
        for (Integer i : list)
          sum = sum + i;
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();

        Random random = new Random();
        for (int i = 0; i < 10; ++i) {
            list1.add(random.nextInt(20));
            list2.add(random.nextInt(20));
        }

        System.out.printf("%s �հ�: %d\n", list1.toString(), getSum(list1));
        System.out.printf("%s �հ�: %d\n", list2.toString(), getSum(list2));
        // int sum = getSum(list2); ������ ���� �߻�
        //������ �̿�
    }
}
