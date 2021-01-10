package 자바리플랙션;

import pakageOne.ClassA;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        Object music = new Music("IU", "YOU AND ME");

        //1번
        Class clazz = Music.class;
        Method getTitle = clazz.getMethod("getTitle");
        String title = (String)getTitle.invoke(music,null);
        System.out.println(title);


        Class clazz2 = Class.forName("자바리플랙션.Music");
        Method getSinger = clazz2.getMethod("getSinger");
        String singer = (String)getSinger.invoke(music,null);
        System.out.println(singer);
        Constructor constructor = clazz2.getConstructor(String.class,String.class);
        System.out.println(constructor);
    }

}
