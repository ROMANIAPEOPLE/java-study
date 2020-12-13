package abstractAndInterface;
//참고로 피죤은 새(조류)다.
public class Pigeon extends Animal implements Flyable {
    public Pigeon(int x, int y, int age){
        super(x,y,age);
    }

    @Override
    public void fly(int yDistance){
        setY(getY() + yDistance);
    }

    @Override
    public void flyMove(int xDistance, int yDistance) {
        setY(getY() + yDistance);
        setX(getX() + xDistance);
    }

    @Override
    public void printInfo(){
        System.out.println("피존+" + toString());
    }

}
