/**
 * Created by admin on 29.12.2016.
 */
public class C8EX5TheSieveOfEratosthenes {

    public static boolean[] Sieve(int n) {
        boolean[] PrimeNumbers = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                PrimeNumbers[i] = true;
            }
        }
        return PrimeNumbers;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(Sieve(33));
        System.out.println(isPrime(99));
        System.out.println(Sieve(9));
    }
}