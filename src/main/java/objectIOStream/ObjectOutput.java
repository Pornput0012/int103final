package objectIOStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutput {
    static String PATH = "./src/main/java/objectIOStream/";

    public static void main(String[] args) {
        Person p1 = new Person("most", 19);
        try (FileOutputStream fo = new FileOutputStream(PATH + "objectfileoutput.txt");
             BufferedOutputStream bo = new BufferedOutputStream(fo);
             ObjectOutputStream objo = new ObjectOutputStream(bo)) {
            objo.writeObject(p1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
