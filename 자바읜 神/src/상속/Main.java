package 상속;

public class Main {
    public static void main(String[] args) {
        SuperClass s = new TempClass();

        s.up();

        System.out.println(s.count);

    }
}
