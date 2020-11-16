package Thread;

import java.util.Random;

public class ThreadLocalSample {
    private final static ThreadLocal<Integer> local = new ThreadLocal<Integer>();
    private static Random random;
    static {
        random = new Random();
    }

    public static Integer generateNumber(){
        int value = random.nextInt(45);
        local.set(value);
        return value;
    }
    public static Integer get(){
        return local.get();
    }
    public static void remove(){
        local.remove();
    }

}

class LocalUserThread extends Thread{
    public void run(){
        int value = ThreadLocalSample.generateNumber();
        System.out.println(this.getName()+ " LocalUserThread value=" +value);

        OtherLogic otherLogic = new OtherLogic();
        otherLogic.printMyNumber();
        ThreadLocalSample.remove();
    }
}

class OtherLogic {
    public void printMyNumber(){
        System.out.println(Thread.currentThread().getName() + "OtherLogic value="+ThreadLocalSample.get());
    }
}
