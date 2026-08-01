import java.util.Scanner;

public class extractdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int number = scanner.nextInt();

        System.out.print("Enter position from the right: ");
        int position = scanner.nextInt();

        int count = 1;

        while (count < position) {
            number = number / 10;
            count++;
        }

        int digit = number % 10;
        System.out.println("Digit is: " + digit);

        scanner.close();
    }
}
