import java.util.Scanner;

public class find {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the statement : ");
        String text = scanner.nextLine();

        int firstPosition = text.indexOf("the");
        int lastPosition = text.lastIndexOf("the");

        if (firstPosition != -1 && lastPosition != -1 && firstPosition != lastPosition) {
            String result = text.substring(firstPosition + 3, lastPosition);
            System.out.println("Characters between the first and last 'the': " + result);
        } else {
            System.out.println("'the' does not occur twice or more in the text.");
        }
    }
}
