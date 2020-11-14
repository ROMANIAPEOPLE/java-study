package Serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import static java.io.File.separator;

public class ManageObject {
    public static void main(String[] args) {
        ManageObject manager = new ManageObject();
        String fullPath = separator+"godofjava"+separator+"text"+separator+"serial.obj";
        SerialDTO dto = new SerialDTO("GodOfJavaBook",1,true,100);
        manager.saveObject(fullPath,dto);
    }

    private void saveObject(String fullPath, SerialDTO dto) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream((fullPath)); // FileOutputStream 객체를 생성했다.
            oos = new ObjectOutputStream(fos);// 객체를 저장하기 위해 objout~ 객체를 생성하고, 1에서 생성한 객체를 매개변수로 넘겼다.
            oos.writeObject(dto); // 매개변수로 넘어온 dto를 저장한다.
            System.out.println("Write Success");
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            if(oos !=null) {
                try {
                    oos.close();
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if(fos !=null) {
                try {
                    fos.close();
                }catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
