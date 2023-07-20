// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Budget {
    public static void main(String[] args) {
        int budget = 60;
        int keyboard[] = {40, 50, 60};
        int drives[] = {5, 8, 12};

        System.out.println(Budget.getMoneySpent(budget, keyboard, drives));

    }

    public static int getMoneySpent(int budget, int keyboard[], int drives[]) {
        int result[] = new int[keyboard.length * drives.length];
        int counter = 0;
        int maxResult = -1;

        for (int i = 0; i < keyboard.length; i++) {
            for (int j = 0; j < drives.length; j++) {

                result[counter] = keyboard[i] + drives[j];
                counter++;
            }
        }

        for (int i : result) {
            if (i <= budget && maxResult < i) {
                maxResult = i;
            }
        }

        return maxResult;
    }
}