package objectIOStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInput {
    static String PATH = "./src/main/java/objectIOStream/";

    public static void main(String[] args) {
        try (FileInputStream fi = new FileInputStream(PATH + "objectfileoutput.txt");
             BufferedInputStream bi = new BufferedInputStream(fi);
             ObjectInputStream obji = new ObjectInputStream(bi)) {
            System.out.println(obji.readObject());
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
