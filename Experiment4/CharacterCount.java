
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void printExceedingCharacters(String input, int n) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > n) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        printExceedingCharacters("aabcdeaabcjlkjerwlaaabbsadfdsf", 3);
    }
}
