public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2){
        if(number1<10 || number1>99 || number2<10 || number2 >99){
            return false;
        }
        int numberOneLastDigit = number1 % 10;
        number1 /= 10;
        int numberTwoLastDigit = number2 % 10;
        number2 /= 10;
        int numberOneFirstDigit = number1;
        int numberTwoFirstDigit = number2;
        if (numberOneLastDigit == numberTwoLastDigit || numberOneLastDigit == numberTwoFirstDigit || numberOneFirstDigit == numberTwoFirstDigit || numberOneFirstDigit == numberTwoLastDigit){
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(21,91));
        System.out.println(hasSharedDigit(10,19));
        System.out.println(hasSharedDigit(22,22));
        System.out.println(hasSharedDigit(1,120));  //ERRORTEST
        System.out.println(hasSharedDigit(120,1));  //ERRORTEST
    }
}
