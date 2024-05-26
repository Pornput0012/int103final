package scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Scanner_ {
    static String PATH = "./src/main/java/fileIOStream/";

    public static void main(String[] args) {
//        demoScannerSystemIn();
//        demoScannerString();
        demoScannerFile();
    }


    static void demoScannerSystemIn() {
        try (Scanner sc = new Scanner(System.in);) {
            String a = sc.next();
            int b = sc.nextInt();
            System.out.println(a + b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void demoScannerString() {
        try (Scanner sc = new Scanner("Hello, World!\nGoodbye");) {
//          have hasNext...() e.g. hasNextDouble() hasNextInt()
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void demoScannerFile() {
        try (Scanner sc = new Scanner(new File(PATH + "fileout.txt"))) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
