package example.c.fork_join;

import java.util.concurrent.ForkJoinPool;

public class FokJoinSample {
    static final ForkJoinPool mainPool = new ForkJoinPool();// 1

    public static void main(String[] args) {
        FokJoinSample fokJoinSample = new FokJoinSample();
        fokJoinSample.calculate();
    }

    public void calculate(){
        long from =0;
        long to = 10;

        GetSum sum = new GetSum(from, to);
        Long result = mainPool.invoke(sum);
        System.out.println(from+"," + to + "," + result);
    }

}
