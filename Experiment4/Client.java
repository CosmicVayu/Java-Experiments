

interface Function {
    int evaluate(int value);
}

class Half implements Function {
    public int evaluate(int value) {
        return value / 2;
    }
}

public class Client {
    public static int[] applyFunction(int[] array) {
        Function half = new Half();
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = half.evaluate(array[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] inputArray = {2, 4, 6, 8};
        int[] outputArray = applyFunction(inputArray);
        for (int value : outputArray) {
            System.out.println(value);
        }
    }
}
