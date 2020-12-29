public class IsPrimeForTest {
    public static void determineNumberOfPrimeInRange(int howManyPrime, int rangeStart, int rangeEnd){
        int primeNumberFound = 0;
            for (int i = rangeStart; i < rangeEnd; i++) {
                if (isPrime(i)) {
                    System.out.println(i + " IS A PRIME NUMBER!");
                    primeNumberFound++;
                }
                if(primeNumberFound == howManyPrime){
                    break;
                }
            }
    }
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        determineNumberOfPrimeInRange(6,20,60);
    }
}
