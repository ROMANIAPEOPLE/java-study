package example.c.IO;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        try(
                DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
                ) {
            out.writeInt(100);
            out.writeBoolean(true);
            out.writeDouble(50.5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
