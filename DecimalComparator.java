public class DecimalComparator {        //RETURN TRUE IF THE DOUBLE NUMBERS ARE EQUAL UP TO 3 DECIMAL PLACES
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
//      return((int)(number1 * 1000) == (int)(number2 * 1000));
        double newValue1 = number1 * 1000;
        double newValue2 = number2 * 1000;
        int final1 = (int)newValue1;
        int final2 = (int)newValue2;
        if (final1 == final2) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.175));
        double a = 3.176 * 1000;
        double b = 3.175 * 1000;
        int c = (int)a;
        int d = (int)b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
