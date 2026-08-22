import java.util.Scanner;

public class LinearSearchToolkit {

    static boolean contains(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                return true;
            }
        }
        return false;
    }

    static int firstIndexOf(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int lastIndexOf(int[] values, int target) {
        for (int i = values.length - 1; i >= 0; i--) {
            if (values[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int countOccurrences(int[] values, int target) {
        int count = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        System.out.println(contains(values, target));
        System.out.println(firstIndexOf(values, target));
        System.out.println(lastIndexOf(values, target));
        System.out.println(countOccurrences(values, target));

        sc.close();
    }
}