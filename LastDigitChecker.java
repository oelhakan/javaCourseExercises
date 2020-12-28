public class LastDigitChecker {
    public static boolean hasSameLastDigit(int number1, int number2, int number3){
      if(!isValid(number1) || !isValid(number2) || !isValid(number3)){
          return false;
      }
        int lastDigitOne = number1 % 10;
        int lastDigitTwo = number2 %10;
        int lastDigitThree = number3 % 10;
        if(lastDigitOne == lastDigitTwo || lastDigitOne == lastDigitThree || lastDigitTwo == lastDigitThree){
            return true;
        }else return false;
    }
    public static boolean isValid(int number){
        if(number<10 || number>1000){
            return false;
        }else return true;
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(1,50,50));  //ERRORTEST
        System.out.println(hasSameLastDigit(50,1,50));  //ERRORTEST
        System.out.println(hasSameLastDigit(50,50,1));  //ERRORTEST
        System.out.println(hasSameLastDigit(1,1,50));   //ERRORTEST
        System.out.println(hasSameLastDigit(1,50,1));   //ERRORTEST
        System.out.println(hasSameLastDigit(50,1,1));   //ERRORTEST
        System.out.println(hasSameLastDigit(1,1,1));    //ERRORTEST
        System.out.println(hasSameLastDigit(123, 293, 763));
        System.out.println(hasSameLastDigit(123, 291, 762));

    }
}
