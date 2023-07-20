import java.util.Scanner;

public class SherlockSquare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Başlangıç ve bitiş değeri giriniz:");
        System.out.println("Başlangıç: ");
        int startNumber = scanner.nextInt();
        System.out.println("Bitiş: ");
        int endNumber = scanner.nextInt();

        if (startNumber > endNumber) {
            System.out.println("Başlangıç değeri bitiş değerinden büyük olamaz. Programı tekrar çalıştırınız...");
        } else {
            System.out.println(sherlockSquare(startNumber, endNumber));
        }
    }

    public static int sherlockSquare(int startNumber, int endNumber) {

        int counter = 0;

        for (int i = startNumber; i <= endNumber; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
