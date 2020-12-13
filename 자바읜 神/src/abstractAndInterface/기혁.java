package abstractAndInterface;

public class 기혁 extends Human implements Swimable, Programmer {
    public 기혁(int x, int y , int age){
        super(x,y,age);
    }

    @Override
    public void coding() {
        System.out.println("취업할수있나요?");
    }

    @Override
    public void swimDown(int yDistance) {
        setY(getY()-yDistance);
        if(getY() < -10) {
            System.out.println("너무 깊이 들어가면 죽어요..!");
        }
    }

    @Override
    public void printInfo() {
        System.out.println("기혁 : " + toString());
    }
}
