import java.util.Arrays;

public class EqualizeArray {
    public static void main(String[] args) {

        int arr[] = {3,3,2,1,3};

        System.out.println(EqualizeArray.equalizeArray(arr));

    }

    public static int equalizeArray(int[] array){

        int currentNumber = 0;
        int counter=0;

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]==array[j]) {
                    currentNumber=array[j];
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (currentNumber == array[i]) {
                counter++;
            }
        }

        return array.length-counter;
    }
}
