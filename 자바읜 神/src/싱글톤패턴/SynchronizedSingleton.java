package 싱글톤패턴;

/**
 * 간단하게 Synchronized를 적용한 싱글톤 패턴
 */

public class SynchronizedSingleton {
    private static SynchronizedSingleton uniqueInstance;

    private SynchronizedSingleton(){

    }
    public static synchronized SynchronizedSingleton getInstance() {
        if(uniqueInstance == null){
            uniqueInstance = new SynchronizedSingleton();
        }
        return uniqueInstance;
    }
}
