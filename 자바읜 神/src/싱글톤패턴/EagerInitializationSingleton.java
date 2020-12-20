package 싱글톤패턴;

/**
 * 클래스가 로드되는 순가에 싱글톤을 생성함.
 */

public class EagerInitializationSingleton {
    private static EagerInitializationSingleton uniqueInstance = new EagerInitializationSingleton();

    private EagerInitializationSingleton(){

    }

    public static EagerInitializationSingleton getInstance() {
        return uniqueInstance;
    }

}
