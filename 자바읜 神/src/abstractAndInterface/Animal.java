package abstractAndInterface;

/**
 * Animal도 추상클래스다. 따라서 printInfo는 Animal을 상속하는 클래스에서 규현해도 된다.
 */

public abstract class Animal extends Creature {
    public Animal(int x, int y, int age) {
        super(x,y,age);
    }

    @Override
    public void attack() {
        System.out.println("몸을 사용하여 공격!");
    }


}
