package bufferFileIO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutput {
    static String PATH = "./src/main/java/bufferFileIO/";

    public static void main(String[] args) {
        String text = "Hello, World!";
        int num = 123;
        boolean b = true;
        char c = 'A';
        byte by = 10;
        try (FileOutputStream fo = new FileOutputStream(PATH + "bufferfileout.txt");
             BufferedOutputStream bo = new BufferedOutputStream(fo)) {
//            String
            bo.write(text.getBytes());
//            int
            bo.write((byte) num);
//            boolean
            bo.write((byte) (b ? 1 : 0));
//            byte
            bo.write(by);
//            char
            bo.write(c);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
