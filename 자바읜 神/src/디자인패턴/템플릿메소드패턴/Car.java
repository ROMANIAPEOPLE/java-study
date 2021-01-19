package 디자인패턴.템플릿메소드패턴;

public abstract class Car {
    public void playWithOwner() {
        System.out.println("시동 켜기");
        System.out.println("사이드 브레이크 해제");

        play();
        runSomeThing();
    }

    abstract void play();

    void runSomeThing(){
        System.out.println("브레이크~!!");
    }
}
