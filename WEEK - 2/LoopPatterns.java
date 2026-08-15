import java.util.Scanner;

public class LoopPatterns {

    // Pattern B
    static void patternB(int size) {
        for (int row = 1; row <= size; row++) {

            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // Pattern C
    static void patternC(int size) {
        for (int row = 1; row <= size; row++) {

            for (int column = 1; column <= row; column++) {
                System.out.print(column + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        if (size < 1) {
            System.out.println("Invalid size");
            return;
        }

        System.out.println("Pattern B:");
        patternB(size);

        System.out.println();

        System.out.println("Pattern C:");
        patternC(size);

        sc.close();
    }
}