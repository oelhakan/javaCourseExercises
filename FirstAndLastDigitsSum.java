public class FirstAndLastDigitsSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        }else if(number<10){
            return number*2;
        }
        int lastDigit = 0;
        int firstDigit = 0;
        lastDigit = number % 10;
        while (number > 99) {
            number = number / 10;
        }
        if(number<=99){
            number = number/10;
            firstDigit = number;
        }
        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(12345));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(-123124));
    }
}



