public class FeetInchCentimeter {
    public static double calcFeetAndInchesToCentimeters(double inches, double feet) {
        if (feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("Invalid Parameters");
            return -1;
        } else {
            double feetToInches = feet * 12;
            double totalInches = inches + feetToInches;
            double centimeters = totalInches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches are equal to " + centimeters + " centimeters.");
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid Parameter");
            return -1;
        } else {
            double remainingInches = inches % 12;
            int feetInInches = (int) inches / 12;
            double finalCentimeters = calcFeetAndInchesToCentimeters(remainingInches, feetInInches);
            return finalCentimeters;
        }
    }

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(200));
        System.out.println(calcFeetAndInchesToCentimeters(10, 15));
    }
}

//1 inch = 2.54cm and one foot = 12 inches
