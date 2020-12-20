package 싱글톤패턴;

/**
 * 가장 기본적인 싱글톤
 */
public class BasicSingleton {
    private static BasicSingleton uniqueInstance;
    private BasicSingleton() {

    }
    public static BasicSingleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new BasicSingleton();
        }
        return uniqueInstance;
    }
}
