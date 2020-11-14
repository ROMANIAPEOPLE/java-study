package Thread;

import java.time.LocalDateTime;
import java.util.Queue;

public class RunThreads {
    public static void main(String[] args) {
        RunThreads threads = new RunThreads();
        threads.runBasic();
    }

    private void runBasic() {
        RunnableSample runnable = new RunnableSample();

        ThreadSample thread = new ThreadSample();
        thread.start();

        System.out.println("RunThreads.runBasic() method is ended");
        new Thread(runnable).start();




    }
}
