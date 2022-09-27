import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean check;

        for (int i = 2; i <= 100; i++) {
            check = false;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = true;
                }
            }
            if (!check) {
                System.out.printf(i+" ");
            }
        }
    }
}