import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Harf giriniz...");
        String s = scanner.nextLine();

        System.out.println("Kaç defa tekrar etmesini istiyorsunuz?");
        int n = scanner.nextInt();

        System.out.println(RepeatedString.repeatedString(s, n));
    }

    public static int repeatedString(String s, int n) {
        int counter = 0;
        int repeat = n / s.length();
        int remainingChar = n % s.length();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                counter++;
            }
        }

        counter = counter * repeat;

        for (int i = 0; i < remainingChar; i++) {
            if (s.charAt(i) == 'a') {
                counter++;
            }
        }
        return counter;
    }
}
