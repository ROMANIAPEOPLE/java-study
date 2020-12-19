package 프록시패턴;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("서비스를 직접 호출하지 말고 프록시를 이용해서 호출");
        Service proxy = new Proxy();
        System.out.println(proxy.runSomething());

    }
}
