public class SpeedConverter {
    public static void main(String[] args) {
        // 1 MPH = 1.609 KMPH
        printConversion(50.0);
        printConversion(-50.0);
        printConversion(0.0);

    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }else{
            double mph = (kilometersPerHour/1.609);
            long result = Math.round(mph);
           return result;
        }
    }
    public static void printConversion(double kilometersPerHour){
        long result = toMilesPerHour(kilometersPerHour);
        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        }else{
        System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");}
    }
}
