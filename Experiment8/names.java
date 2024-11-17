import java.util.Arrays;

public class names {
    public static void main(String[] args) {
        String[] names = {"Sayantan", "Shivam", "Ishaan", "Rishav", "Anant", "Ajitesh", "Aman", "Suraj", "Ravi", "Vikas"};

        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > 3) {
                names[i] = names[i].substring(3);
            }
        }
        System.out.println("\n");

        Arrays.sort(names);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
