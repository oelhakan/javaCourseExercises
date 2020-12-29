

public class LargestPrimeNumber {
    public static int getLargestPrime(int number){
            if (number <= 1) {
                return -1;
            } else {
                int divisor = 2;
                while(divisor<number){
                    if(number%divisor != 0){
                        divisor++;
                    }else{
                        number /= divisor;
                        divisor = 2;
                    }
                }
            }return number;
        }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(33));
    }
    }

