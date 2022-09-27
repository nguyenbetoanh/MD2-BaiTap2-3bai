import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.println("Nhập 1 số nguyên bat kì !");
        int n = number.nextInt();
        boolean check;
        int count = 0;
        if (n >= 2) {
            for (int i = 2; i <= n; i++) {
                check = false;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        check = true;
                        break;
                    }
                } if (!check && count < 20) {
                    count++;
                    System.out.print(i + " ");
                }
            }
            System.out.println("");
        }

    }
}