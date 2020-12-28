public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse =0;
        int initialNumber = number;
        while(number != 0) {
            reverse = reverse*10;
            reverse = reverse + number%10;
            number = number/10;
        }
        if (reverse == initialNumber) {
            return true;
        } else return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(1231241));
        System.out.println(isPalindrome(-1231241));
        System.out.println(isPalindrome(0));
    }
}
