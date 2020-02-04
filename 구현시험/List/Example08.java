package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

// List를 통한 다형성 이해
public class Example08 {

    static int getSum(List<Integer> list) { //List 대신 ArrayList를 사용한다면 다형성이 적용되지 않아 LinkedList를 실행할 수 없게 된다.
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

        System.out.printf("%s 합계: %d\n", list1.toString(), getSum(list1));
        System.out.printf("%s 합계: %d\n", list2.toString(), getSum(list2));
        // int sum = getSum(list2); 컴파일 에러 발생
        //다형성 이용
    }
}
