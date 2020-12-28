public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int gcd = 1;
        for (int i = 1; i <= first && i <= second; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;    //CHECK EVERY NUMBER THAT IS SMALLER THAN N1 OR N2 THEN CHECK IF IT DIVIDES BOTH
            }                //N1 AND N2, IF IT DOES SET GCD TO THAT NUMBER
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(9,15));     //ERRORTEST
        System.out.println(getGreatestCommonDivisor(15,9));     //ERRORTEST
        System.out.println(getGreatestCommonDivisor(9,9));      //ERRORTEST
        System.out.println(getGreatestCommonDivisor(1010,10));
    }
}
