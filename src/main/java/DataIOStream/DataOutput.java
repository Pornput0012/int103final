package DataIOStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutput {
    static String PATH = "./src/main/java/DataIOStream/";

    public static void main(String[] args) {
        String text = "Hello, World!";
        int num = 123;
        boolean b = true;
        char c = 'A';
        byte by = 10;
        Double d = 456.789;
        try (FileOutputStream fo = new FileOutputStream(PATH + "datafileoutput.txt");
             BufferedOutputStream bo = new BufferedOutputStream(fo);
             DataOutputStream dos = new DataOutputStream(bo)) {
            // เขียนข้อมูลลงในไฟล์
            dos.writeUTF(text); // สตริง
            dos.writeInt(num); // จำนวนเต็ม
            dos.writeBoolean(b); // ค่าบูลีน
            dos.writeChar(c); // ตัวอักษร
            dos.writeByte(by); // ไบต์
            dos.writeDouble(d); // ทศนิยม
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
