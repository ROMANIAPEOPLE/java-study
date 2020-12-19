package 프록시패턴;

public class Proxy implements Service {

    Service service1;

    @Override
    public String runSomething() {
        System.out.println("프록시는 대리자(대리인) 역할. 호출에 대한 흐름 제어를 할 뿐. 반환결과는 그대로!");

        service1 = new ServiceImpl();
        return service1.runSomething();
    }
}
