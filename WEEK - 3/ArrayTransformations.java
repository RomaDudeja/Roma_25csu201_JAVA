public class ArrayTransformations {

    static void reverseInPlace(int[] values) {
        int left = 0;
        int right = values.length - 1;

        while (left < right) {
            int temp = values[left];
            values[left] = values[right];
            values[right] = temp;

            left++;
            right--;
        }
    }

    static int[] reversedCopy(int[] values) {
        int[] newArray = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            newArray[i] = values[values.length - 1 - i];
        }

        return newArray;
    }

    static int removeValue(int[] values, int target) {
        int j = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] != target) {
                values[j] = values[i];
                j++;
            }
        }

        return j;
    }

    static int[] runningSum(int[] values) {
        int[] result = new int[values.length];
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
            result[i] = sum;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] values = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

        reverseInPlace(values);

        System.out.println("\nReversed Array:");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

        int[] copy = reversedCopy(values);

        System.out.println("\nReversed Copy:");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }

        int[] numbers = {3, 2, 2, 3, 4};

        int length = removeValue(numbers, 3);

        System.out.println("\nAfter Removing 3:");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + " ");
        }

        int[] sums = runningSum(values);

        System.out.println("\nRunning Sum:");
        for (int i = 0; i < sums.length; i++) {
            System.out.print(sums[i] + " ");
        }
    }
}