package example.c.inheritance;

public class Dog extends Animal {

    private int dogAge;

    public Dog(int dogAge) {
        super("Dog");
        this.dogAge = dogAge;
    }

    @Override
    public void move(){
        System.out.println("강아지가 이쪽으로 온다.");
    }

    @Override
    public void eatFood(){
        System.out.println("강아지가 밥을 먹는다.");
    }
}
