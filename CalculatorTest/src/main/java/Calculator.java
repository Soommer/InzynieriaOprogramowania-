public class Calculator {
    public static int add_numbers(int a, int b) {
            return a+b;
    }

    public static boolean is_even(int n) {
        return n % 2 == 0;
    }

    public static double celsius_to_fahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Silnia nie jest zdefiniowana dla liczb ujemnych.");
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static boolean is_prime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
