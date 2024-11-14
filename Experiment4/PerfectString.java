
import java.util.HashSet;

public class PerfectString {
    public static boolean isPerfectString(String input) {
        HashSet<Character> set = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (!set.add(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectString("absdhkqwertyuioplmnvczx"));
        System.out.println(isPerfectString("aabbcc"));
    }
}
