package fileIOStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInput {
    static String PATH = "./src/main/java/fileIOStream/";

    public static void main(String[] args) {
        demoRead();
        demoReadAllBytes();
        demoReadNBytes();
    }


    static void demoRead() {
        try (FileInputStream fi = new FileInputStream(PATH + "fileout.txt")) {
            int result;
            while ((result = fi.read()) != -1) {
                System.out.println((char) result);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void demoReadAllBytes() {
        try (FileInputStream fi = new FileInputStream(PATH + "fileout.txt")) {
            byte[] data = fi.readAllBytes();
            String content = new String(data, 0, data.length);
            System.out.println("readAllByte : " + content);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void demoReadNBytes() {
        try (FileInputStream fi = new FileInputStream(PATH + "fileout.txt")) {
            byte[] buffer = new byte[fi.available()];
            int bytesRead = fi.readNBytes(buffer, 0, buffer.length);
            String content = new String(buffer, 0, buffer.length);
            System.out.println("readNByte : " + content);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
