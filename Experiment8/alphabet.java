import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if ("AEIOUaeiou".indexOf(c) != -1) {
                System.out.println("Vowel: " + c + ", Position: " + i);
            }
        }
    }
}
