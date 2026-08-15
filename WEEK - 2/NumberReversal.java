import java.util.Scanner;

public class NumberReversal {

    public static int reverseNumber(int number) {

        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        return reversed;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Invalid number");
        }
        else {
            System.out.println("Reversed number = " + reverseNumber(number));
        }

        input.close();
    }
}
