package bufferFileIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferInput {
    static String PATH = "./src/main/java/fileIOStream/";

    public static void main(String[] args) {
//        Buffer can set size -> new BufferI/oStream(fileIOStream, size);
        demoRead();
        demoReadAllBytes();
        demoReadNBytes();
    }


    static void demoRead() {
        try (FileInputStream fi = new FileInputStream(PATH + "fileout.txt");
             BufferedInputStream bi = new BufferedInputStream(fi)) {
            int result;
            while ((result = bi.read()) != -1) {
                System.out.println((char) result);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void demoReadAllBytes() {
        try (FileInputStream fi = new FileInputStream(PATH + "fileout.txt");
             BufferedInputStream bi = new BufferedInputStream(fi)) {
            byte[] data = bi.readAllBytes();
            String content = new String(data, 0, data.length);
            System.out.println("readAllByte : " + content);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void demoReadNBytes() {
        try (FileInputStream fi = new FileInputStream(PATH + "fileout.txt");
             BufferedInputStream bi = new BufferedInputStream(fi)) {
            byte[] buffer = new byte[bi.available()];
            int bytesRead = bi.readNBytes(buffer, 0, buffer.length);
            String content = new String(buffer, 0, buffer.length);
            System.out.println("readNByte : " + content);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
