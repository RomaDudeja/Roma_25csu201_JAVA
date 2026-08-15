import java.util.Scanner;

public class FinalValueOperations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = 0;

        System.out.print("Enter number of operations: ");
        int number = input.nextInt();

        input.nextLine();

        for (int i = 1; i <= number; i++) {

            System.out.print("Enter operation: ");
            String operation = input.nextLine();

            if (operation.contains("+")) {
                x++;
            }
            else {
                x--;
            }
        }

        System.out.println("Final value of X = " + x);

        input.close();
    }
}
