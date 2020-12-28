public class PerfectNumber {
    //A PERFECT NUMBER IS A POSITIVE INTEGER WHICH IS EQUAL TO THE SUM OF ITS PROPER POSITIVE DIVISORS
    // PROPER POSITIVE DIVISORS ARE THE NUMBERS THAT FULLY DIVIDE THE PERFECT NUMBER WITHOUT LEAVING A REMAINDER AND EXCLUDE THE PERFECT NUMBER ITSELF
    public static boolean isPerfectNumber(int number) {
        int sumOfProperDivisors = 0;
        if (number < 1) {
            return false;
        }
        for (int i = 1; i < number; i++) {
            if ((number % i) == 0) {
                sumOfProperDivisors += i;
            }
        }

        if (number == sumOfProperDivisors) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(10));
        System.out.println(isPerfectNumber(0)); //ERRORTEST
        System.out.println(isPerfectNumber(-5));    //ERRORTEST
    }
}