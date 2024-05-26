package DataIOStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInput {
    static String PATH = "./src/main/java/DataIOStream/";

    public static void main(String[] args) {
        demoRead();
    }

    static void demoRead() {
        try (FileInputStream fi = new FileInputStream(PATH + "datafileoutput.txt");
             BufferedInputStream bi = new BufferedInputStream(fi);
             DataInputStream dis = new DataInputStream(bi)) {
            // อ่านข้อมูลจากไฟล์
            String text = dis.readUTF(); // อ่านสตริง
            int num = dis.readInt(); // อ่านจำนวนเต็ม
            boolean b = dis.readBoolean(); // อ่านค่าบูลีน
            char c = dis.readChar(); // อ่านตัวอักษร
            byte by = dis.readByte(); // อ่านไบต์
            double d = dis.readDouble(); // อ่านทศนิยม

            // แสดงผลข้อมูลที่อ่าน
            System.out.println("Text: " + text);
            System.out.println("Integer: " + num);
            System.out.println("Boolean: " + b);
            System.out.println("Char: " + c);
            System.out.println("Byte: " + by);
            System.out.println("Double: " + d);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
