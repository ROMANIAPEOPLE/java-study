package Thread;

public class NameThread extends Thread{
    private int calcNumber;
    public NameThread() {
        //만약 쓰레드의 이름을 지정하고 싶다면,
        super("ThreadName");
    }

    //쓰레드를 통해 매개 변수를 넘기고 싶다면,
    public NameThread(String name, int calcNumber) {
        super(name);
        this.calcNumber= calcNumber;
    }


    public void run() {
        calcNumber++;
    }

}
