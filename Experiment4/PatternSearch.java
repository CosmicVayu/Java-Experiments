
public class PatternSearch {
    public static int countPatternOccurrences(int start, int end, String pattern) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (Integer.toString(i).contains(pattern)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPatternOccurrences(0, 100, "13"));
        System.out.println(countPatternOccurrences(100, 1000, "13"));
        System.out.println(countPatternOccurrences(100, 10000, "13"));
    }
}
