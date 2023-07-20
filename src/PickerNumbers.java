import java.util.Arrays;

public class PickerNumbers {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 2, 4, 4, 5, 5, 5};
        System.out.println(pickingNumbers(numbers));
    }

    public static int pickingNumbers(int[] numbers) {
        int count = 0;
        int max = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (Math.abs(numbers[i] - numbers[j]) <= 1) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
            }
            count = 0;


        }
        return max + 1;
    }
}