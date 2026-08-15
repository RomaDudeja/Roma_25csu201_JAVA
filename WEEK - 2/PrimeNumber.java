public class PrimeNumber {

    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] numbers = {-5, 0, 1, 2, 3, 4, 17, 25, 97};

        for (int number : numbers) {
            System.out.println(number + " : " + isPrime(number));
        }
    }
}