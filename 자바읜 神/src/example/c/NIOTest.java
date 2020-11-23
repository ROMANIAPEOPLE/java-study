package example.c;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOTest {
    public static void main(String[] args) {
        NIOTest n = new NIOTest();
        n.basicWriteAndRead();

    }

    private void basicWriteAndRead() {
        String fileName = "C:\\godofjava\\text\\test2.txt";
        try{
            writeFile(fileName,"My first NIO sample.");
            readFile(fileName);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void writeFile(String fileName, String data) throws Exception{
        FileChannel channel = new FileOutputStream(fileName).getChannel();
        byte[] byteData = data.getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(byteData);
        channel.write(buffer);
        channel.close();
    }

    public void readFile(String fileName) throws Exception {
        FileChannel channel = new FileInputStream(fileName).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        channel.read(buffer);
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.println((char) buffer.get());
        }
        channel.close();
    }
}