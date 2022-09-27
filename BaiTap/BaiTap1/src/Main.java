import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner draw = new Scanner(System.in);

        do {
            System.out.printf("\n");
            System.out.println("**************Vẽ hình bạn muốn**************");
            System.out.println("1 . Hình chữ nhật");
            System.out.println("2. Hình tam giác xuôi");
            System.out.println("3.Tam giác ngược ");
            System.out.println("4. Thoát");

            int choose = Integer.parseInt(draw.nextLine());

            switch (choose){
                case 1:
                    for (int i = 1; i <5 ; i++) {
                        for (int j = 1; j < 15; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for (int i = 1; i <10 ; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for (int i = 10; i > 0; i--) {
                        for (int j = 0; j <i ; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.exit(0);
            }

        }while (true);
    }
}