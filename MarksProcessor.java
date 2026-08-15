import java.util.Scanner;

public class MarksProcessor {

    public static boolean isValidMark(int mark) {
        if (mark >= 0 && mark <= 100) {
            return true;
        } else {
            return false;
        }
    }

    public static double calculateAverage(int sum, int count) {
        if (count == 0) {
            return 0;
        }

        return (double) sum / count;
    }

    public static void printResults(int count, int sum, double average,
                                    int highest, int passes, int failures) {

        System.out.println("Number of valid marks = " + count);
        System.out.println("Sum of marks = " + sum);
        System.out.println("Average mark = " + average);

        if (count > 0) {
            System.out.println("Highest mark = " + highest);
        } else {
            System.out.println("Highest mark = No marks entered");
        }

        System.out.println("Number of passes = " + passes);
        System.out.println("Number of failures = " + failures);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mark;
        int count = 0;
        int sum = 0;
        int highest = 0;
        int passes = 0;
        int failures = 0;

        System.out.println("Enter marks (-1 to stop):");

        while (true) {

            mark = input.nextInt();

            if (mark == -1) {
                break;
            }

            if (!isValidMark(mark)) {
                System.out.println("Invalid mark");
                continue;
            }

            count++;
            sum = sum + mark;

            if (count == 1 || mark > highest) {
                highest = mark;
            }

            if (mark >= 50) {
                passes++;
            } else {
                failures++;
            }
        }

        double average = calculateAverage(sum, count);

        printResults(count, sum, average, highest, passes, failures);

        input.close();
    }
}