package fileIOStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
    static String PATH = "./src/main/java/fileIOStream/";

    public static void main(String[] args) {
        String text = "Hello, World!";
        int num = 123;
        boolean b = true;
        char c = 'A';
        byte by = 10;
        try (FileOutputStream fo = new FileOutputStream(PATH + "fileout.txt")) {
//            String
            fo.write(text.getBytes());
//            int
            fo.write((byte) num);
//            boolean
            fo.write((byte) (b ? 1 : 0));
//            byte
            fo.write(by);
//            char
            fo.write(c);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
