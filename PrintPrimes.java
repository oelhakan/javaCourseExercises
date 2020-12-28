public class LargestPrime {
    public static void printPrimes(int number) {
        if (number <2) {
            System.out.println("INVALID VALUE");
        }
        int initialNumber = number;
        while(number%2 == 0){
            System.out.println("2");
            number /= 2;
        }
        int i = 3;
        while(i<initialNumber) {
            if (number % i == 0) {
                System.out.println(i);
                number /= i;
            }
            i = i + 2;
        }
        if(number>2){
            System.out.println(number);
        }
        }



    public static void main(String[] args) {
        printPrimes(35);
    }
}

