public class IsPrimeForTest {
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int primeNumberFound = 0;
        if (primeNumberFound < 3) {
            for (int i = 20; i < 35; i++) {
                if (isPrime(i)) {
                    System.out.println(i + " IS A PRIME NUMBER!");
                    primeNumberFound++;
                }
            }
        }
        if (primeNumberFound == 3) {
            System.out.println("FOUND 3 PRIME NUMBERS - TERMINATING THE PROGRAM!");
        }else System.exit(0);

    }
}
