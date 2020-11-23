package example;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class etc {
    public static void main(String[] args) {
        etc e = new etc();
        String pathName = File.separator+"godofjava"+ File.separator+"text";
        String fileName= "test2.txt";
        e.checkPath(pathName, fileName);
    }

    private void checkPath(String pathName, String fileName) {
        File file = new File(pathName,fileName);
        try {
            System.out.println("Create result =" + file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
