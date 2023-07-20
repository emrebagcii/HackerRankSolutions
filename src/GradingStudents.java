public class GradingStudents {
    public static void main(String[] args) {
        int firstGrade[] = {73, 67, 38, 33};
        int roundedGrade[] = new int[firstGrade.length];
        int counter = 0;

        for (int i : firstGrade) {
            //roundedGrade[counter] = GradingStudents.gradingStudents(i);
            roundedGrade[counter]=GradingStudents.gradingStudents(i,5);
            if (roundedGrade[counter] - i < 3 && roundedGrade[counter] >= 38) {
                System.out.println(roundedGrade[counter]);
                counter++;
            } else {
                System.out.println(firstGrade[counter]);
                counter++;
            }
        }

    }

    /*
    public static int gradingStudents(int grade) {
        int roundedGrade = ((grade + 4) / 5) * 5;   //gelen sayı 5'in katına yuvarlanır
        return roundedGrade;
    }*/

    public static int gradingStudents(double value, int nearest) {

        return (int) Math.ceil(value / nearest) * nearest;
    }
}
