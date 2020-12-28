public class NumberToWords {
    public static void printer(int number){
        if(number==0){
            System.out.println("ZERO");
        }else if (number==1){
            System.out.println("ONE");
        }else if (number==2){
            System.out.println("TWO");
        }else if (number==3){
            System.out.println("THREE");
        }else if (number==4){
            System.out.println("FOUR");
        }else if (number==5){
            System.out.println("FIVE");
        }else if (number==6){
            System.out.println("SIX");
        }else if (number==7){
            System.out.println("SEVEN");
        }else if (number==8){
            System.out.println("EIGHT");
        }else if (number==9){
            System.out.println("NINE");
        }else System.out.println("INVALID VALUE");
    }

    public static void numberToWords(int number){
    if(number<0){
        printer(-1);
    }
    if(number == 0){
       printer(0);
    }
    int reversedNumber = reverse(number);
    int digitOfReversed = getDigitCount(reversedNumber);
    int digitOfNumber = getDigitCount(number);
    if(digitOfNumber == digitOfReversed){
        int lastDigit = 0;
        while (reversedNumber != 0) {
            lastDigit = reversedNumber % 10;
            if (lastDigit == 0) {
                printer(0);
            } else if (lastDigit == 1) {
                printer(1);
            } else if (lastDigit == 2) {
                printer(2);
            } else if (lastDigit == 3) {
                printer(3);
            } else if (lastDigit == 4) {
                printer(4);
            } else if (lastDigit == 5) {
                printer(5);
            } else if (lastDigit == 6) {
                printer(6);
            } else if (lastDigit == 7) {
                printer(7);
            } else if (lastDigit == 8) {
                printer(8);
            } else if (lastDigit == 9) {
                printer(9);
            }
            reversedNumber /= 10;
            if (reversedNumber == 0) {
                break;
            }
        }
    }else{
        int difference = digitOfNumber - digitOfReversed;
        int lastDigit = 0;
        int numberToPrint = 0;
        while(reversedNumber>0) {
            lastDigit = reversedNumber % 10;
            printer(lastDigit);
            reversedNumber /= 10;
        while(reversedNumber==0){
            for(int i=0; i<difference; i++){
                printer(0);
            }break;
        }
    }
}

}


    public static int reverse(int numberToReverse) {
        int reversedNumber = 0;
        int lastDigit = 0;
        while (numberToReverse != 0) {
            lastDigit = numberToReverse % 10;
            reversedNumber *= 10;
            reversedNumber += lastDigit;
            numberToReverse /= 10;
            if (numberToReverse == 0) {
                break;
            }
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int digitCount = 0;
        if (number == 0) {
            return 1;
        }
        while (number > 0) {
            if (number > 0) {
                digitCount++;
                number /= 10;
            } else break;
        }
        return digitCount;
    }

    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(-5));
        System.out.println(getDigitCount(147589));
        System.out.println(getDigitCount(001));
        System.out.println(getDigitCount(100));

        System.out.println(reverse(1234));
        System.out.println(reverse(-1234));
        System.out.println(reverse(0));

        numberToWords(reverse(1506));
        numberToWords(235);
        numberToWords(100);
        numberToWords(150);
    }
}
