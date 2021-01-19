package 자바리플렉션2;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ContainerService {

    public static <T> T getObject(Class<T> classType) throws NoSuchMethodException {
        T instance = createInstance(classType);
        Arrays.stream(classType.getDeclaredFields()).forEach(f ->{
            if(f.getAnnotation(Inject.class) != null) {
                Object fieldInstance = createInstance(f.getType());
                f.setAccessible(true);
                try {
                    f.set(instance, fieldInstance);
                }catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        return instance;

        }

    public static <T> T createInstance(Class<T> classType) {
        try {
            return classType.getConstructor(null).newInstance();
        } catch (InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

