package 싱글톤패턴;

/**
 * 싱글톤이 생성되어야 할 경우에만 Lock을 걸어 성능문제와 동시성문제를 해결함
 */
public class DoubleCheckingLockingSingleton {
    private volatile static DoubleCheckingLockingSingleton uniqueInstance;

    private DoubleCheckingLockingSingleton(){

    }

    public static DoubleCheckingLockingSingleton getInstance() {
        if(uniqueInstance == null){
            synchronized (DoubleCheckingLockingSingleton.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckingLockingSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}