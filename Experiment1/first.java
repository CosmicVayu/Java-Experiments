import java.util.Scanner;

class Basic {
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is:" + sum);
    }

    void sub(int a, int b) {
        int sub = a - b;
        System.out.println("Sub is:" + sub);
    }

    void product(int a, int b) {
        int prod = a * b;
        System.out.println("Product is:" + prod);
    }

    void divide(int a, int b) {
        int div = a / b;
        System.out.println("Divide is:" + div);
    }
}

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Basic ba = new Basic();
        int ch = 0;
        do {

            System.out.println("1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");

            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            System.out.println("Enter a and b:");

            int a = sc.nextInt();
            int b = sc.nextInt();

            switch (ch) {
                case 1:
                    ba.add(a, b);
                    break;

                case 2:
                    ba.sub(a, b);
                    break;

                case 3:
                    ba.product(a, b);
                    break;

                case 4:
                    ba.divide(a, b);
                    break;

                default:
                    System.exit(1);
            }

        } while (ch < 4);

    }
}