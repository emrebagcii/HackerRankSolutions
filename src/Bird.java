public class Bird {
    public static void main(String[] args) {
        int [] array  = {1,2,1,2,3,2};
        System.out.println(migratoryBirds(array));
    }

    public static int migratoryBirds(int[] arr) {
        int max = 0;
        int[] countArray = new int[arr.length];

        for (int val : arr) {
            countArray[val]++;
            max = Math.max(max, countArray[val]);
        }

        for(int i =0; i<countArray.length; i++) {
            if(countArray[i] == max) {
                return i;
            }
        }
        return 1; // bu hiç çalışmıcak. int return olduğu için koyduk.
    }
}