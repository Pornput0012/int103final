package trycatch;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        tryCatchBasic();
    }

    static void tryCatchBasic() {
        try {
//            error
            int divibyZero = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException : " + e.getMessage());
//            default print error
//            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
//            default print error
//            e.printStackTrace();
        }
    }

    static void tryCatchFinally() {
        try {
            int a = (int) (Math.random() * 10) + 1;
            if (a % 2 == 0) {
                throw new Exception("mock Error");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
//          finally is done after checking for exceptions every time.
            System.out.println("End Program!!");
        }
    }

    static void tryWithResource() {
        try (Scanner sc = new Scanner(System.in)) {
//        The scanner will be closed after use.
        }
//        catch(){}...finally{}...
    }
}
