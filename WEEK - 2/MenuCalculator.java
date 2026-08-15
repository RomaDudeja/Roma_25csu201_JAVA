import java.util.Scanner;

public class MenuCalculator {

    static void printMenu() {
        System.out.println("\n1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("0. Exit");
    }

    static double calculate(int choice, double num1, double num2) {

        switch (choice) {
            case 1:
                return num1 + num2;

            case 2:
                return num1 - num2;

            case 3:
                return num1 * num2;

            case 4:
                return num1 / num2;

            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        do {
            printMenu();

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Calculator closed");
            }
            else if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice");
            }
            else {
                System.out.print("Enter first number: ");
                num1 = input.nextDouble();

                System.out.print("Enter second number: ");
                num2 = input.nextDouble();

                if (choice == 4 && num2 == 0) {
                    System.out.println("Cannot divide by zero");
                }
                else {
                    result = calculate(choice, num1, num2);
                    System.out.println("Result = " + result);
                }
            }

        } while (choice != 0);

        input.close();
    }
}