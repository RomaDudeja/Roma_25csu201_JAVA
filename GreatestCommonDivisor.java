public class GreatestCommonDivisor {

    public static int gcd(int first, int second) {

        first = Math.abs(first);
        second = Math.abs(second);

        while (second != 0) {
            int remainder = first % second;

            first = second;
            second = remainder;
        }

        return first;
    }

    public static void main(String[] args) {

        System.out.println("GCD of 48 and 18 = " + gcd(48, 18));
        System.out.println("GCD of 21 and 14 = " + gcd(21, 14));
        System.out.println("GCD of 7 and 5 = " + gcd(7, 5));
        System.out.println("GCD of 100 and 0 = " + gcd(100, 0));
    }
}
