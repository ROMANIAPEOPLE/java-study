package Thread;

public class DaemonThread extends Thread {
    public static void main(String[] args) {
        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true);
        thread.start();
    }
    public void run(){
        try{
            Thread.sleep(Long.MAX_VALUE);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
