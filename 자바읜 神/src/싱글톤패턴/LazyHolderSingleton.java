package 싱글톤패턴;

public class LazyHolderSingleton {

    private LazyHolderSingleton() {
    }

    public static LazyHolderSingleton getInstance() {
        return LazyHolder.uniqueInstance;
    }

    private static class LazyHolder {
        private static final LazyHolderSingleton uniqueInstance = new LazyHolderSingleton();
    }
}
