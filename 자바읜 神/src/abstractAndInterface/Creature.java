package abstractAndInterface;

/**
 * 기본적으로 생명체가 가지는 x,y좌표와 나이(age)가 있다.
 * 추상메소드로는 공격기능과 정보출력이 있다. 공통적으로 필요하지만, 생명체에 따라 다르다.
 *
 */
public abstract class Creature {
    private int x;
    private int y;
    private int age;


    public Creature(int x, int y , int age) {
        this.x=x;
        this.y=y;
        this.age=age;
    }
    public void age() {
        age++;
    }
    public void move(int xDistance) {
        x += xDistance;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x =x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public abstract  void attack();
    public abstract  void printInfo();
    @Override
    public String toString() {
        return "x : " + x + ", y : " + y + ", age : " + age;
    }
}
