package Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ManageObjectInput {
    public void loadObject(String fullPath) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream((fullPath));
            ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            SerialDTO dto = (SerialDTO)obj;
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            if(ois !=null) {
                try {
                    ois.close();
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if(fis !=null) {
                try {
                    fis.close();
                }catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
