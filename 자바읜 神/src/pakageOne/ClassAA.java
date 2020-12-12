package pakageOne;

public class ClassAA extends  ClassA {
    void runSomeThing() {
//        pri =1; // 상속관계에서는 private만 접근이 불가능하다.
        def = 1;
        pro =1;
        pub =1;
    }
}
