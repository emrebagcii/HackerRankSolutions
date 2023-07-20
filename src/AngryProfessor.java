import java.util.Scanner;

public class AngryProfessor {
    public static void main(String[] args) {
        int arrivalTime[] = {-2, -1, 0, 1, 2};

        System.out.println("Enter threshold value...");

        Scanner scanner=new Scanner(System.in);
        int threshold= scanner.nextInt();
        System.out.println(AngryProfessor.angryProfessor(arrivalTime,threshold));
    }
    public static String angryProfessor(int[] arrivalTime,int thresholdValue) {
        int counter = 0;
        String answer;

        for (int i = 0; i < arrivalTime.length; i++) {
            if (arrivalTime[i] <= 0) {
                counter++;
            }
        }

        if (counter >= thresholdValue) {
            answer = "Yes";
        } else {
            answer = "No";
        }

        return answer;
    }
}
