package 상속;

public class Child extends Parent {


    public Child(int value) {
        super(value); //부모 생성자에 기본 생성자가 없으면, 이렇게 명시적으로 부모생성자를 호출해줘야 한다.
    }

    public static void main(String[] args) {
        System.out.println("??");
    }
}
