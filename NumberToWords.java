public class NumberToWords {

    public static String INVALID_VALUE = "INVALID VALUE";
    public static String ZERO = "ZERO";
    public static String ONE = "ONE";
    public static String TWO = "TWO";
    public static String THREE = "THREE";
    public static String FOUR = "FOUR";
    public static String FIVE = "FIVE";
    public static String SIX = "SIX";
    public static String SEVEN = "SEVEN";
    public static String EIGHT = "EIGHT";
    public static String NINE = "NINE";
            //NUMBER = 1   ORIGINALNUMBER = 100
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println(INVALID_VALUE);
        }
        int lastDigit = 0;
        int firstDigit = 0;
        while (number != 0) {
            lastDigit = number % 10;
                if (lastDigit == 0) {
                    System.out.println(ZERO);
                } else if (lastDigit == 1) {
                    System.out.println(ONE);
                } else if (lastDigit == 2) {
                    System.out.println(TWO);
                } else if (lastDigit == 3) {
                    System.out.println(THREE);
                } else if (lastDigit == 4) {
                    System.out.println(FOUR);
                } else if (lastDigit == 5) {
                    System.out.println(FIVE);
                } else if (lastDigit == 6) {
                    System.out.println(SIX);
                } else if (lastDigit == 7) {
                    System.out.println(SEVEN);
                } else if (lastDigit == 8) {
                    System.out.println(EIGHT);
                } else if (lastDigit == 9) {
                    System.out.println(NINE);
                }
                number /= 10;
                if (number == 0) {
                    break;
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
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(-5));
//        System.out.println(getDigitCount(147589));
//        System.out.println(getDigitCount(001));
//        System.out.println(getDigitCount(100));
//
//        System.out.println(reverse(1234));
//        System.out.println(reverse(-1234));
//        System.out.println(reverse(0));
//
//        numberToWords(reverse(1506));
        numberToWords(reverse(1546));
    }
}