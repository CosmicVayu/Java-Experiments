

public class PasswordValidator {
    public static boolean validatePassword(String password) {
        if (password.length() < 5 || password.length() > 12) return false;
        if (!password.matches(".*[a-z].*")) return false;
        if (!password.matches(".*\\d.*")) return false;
        if (password.matches(".*[A-Z].*")) return false;
        if (password.matches(".*[^a-zA-Z0-9].*")) return false;
        for (int i = 0; i < password.length() - 1; i++) {
            if (password.charAt(i) == password.charAt(i + 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validatePassword("123sd123"));
        System.out.println(validatePassword("abc11se"));
    }
}
