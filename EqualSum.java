public class EqualSum {
    public static boolean hasEqualSum(int number1, int number2, int number3){
        if(number1 + number2 == number3){
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 2, 3));
        System.out.println(hasEqualSum(1, 2, 4));
        System.out.println(hasEqualSum(0, 0, 0));
        System.out.println(hasEqualSum(0, 0, 3));
        System.out.println(hasEqualSum(-7, -5, -12));
        System.out.println(hasEqualSum(-7, -5, 3));
        System.out.println(hasEqualSum(-5, 2, -3));
        System.out.println(hasEqualSum(-5, 2, 3));

    }
}
