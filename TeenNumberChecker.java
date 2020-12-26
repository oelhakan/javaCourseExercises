public class TeenNumberChecker {    //WE WILL SAY A NUMBE IS TEEN IF ITS IN THE RANGE 13-19|(INCLUSIVE)

    public static boolean hasTeen(int number1, int number2, int number3) {
        //IF ANY OF THE PARAMETERS ARE IN THE RANGE OF 13-19 RETURN TRUE(13 AND 19 INCLUSIVE)
        if (((13 <= number1) && (19 >= number1)) || ((13 <= number2) && (19 >= number2)) || ((13 <= number3) && (19 >= number3))) {
            return true;
        } else return false;
    }

    public static boolean isTeen(int number1) {
        //IF THE PARAMETER IS IN THE RANGE OF 13-19 RETURN TRUE(13 AND 19 INCLUSIVE)
        if ((13 <= number1) && (19 >= number1)) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(1, 2, 3));
        System.out.println(hasTeen(13, 2, 3));
        System.out.println(hasTeen(13, 14, 3));
        System.out.println(hasTeen(13, 14, 15));

        System.out.println(isTeen(1));
        System.out.println(isTeen(17));
        System.out.println(isTeen(22));
    }
}
