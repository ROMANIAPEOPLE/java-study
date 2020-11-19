package example.c.nestedClass;

public class OuterOfStatic {
    static int i = 1;
    final static int j = 3;
    int k = 4;

    static class StaticNested {
        public static void main(String[] args) {
            i = 3;
//            k=5;  static 내부클래스에서는 static한 변수만 사용 가능.
        }

        public void test() {

        }
    }

    class Ineer {
        public void test() {
            i = 2;
            k = 5;
//           모두 사용 가능
        }
//        public static void test2(){
//            단, static 메소드는 생성 불가능
    }
}
