public class MinutesToYearsAndDays {            //525.600 MINUTES IN A YEAR - 1.440 MINUTES IN A DAY
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }else{
        long years = minutes / 525600L;
        long remainingMinutes = minutes % 525600L;
        long days = remainingMinutes / 1440L;
        System.out.println(minutes + " min = " + years + " y and " + days + " d");}
    }

    public static void main(String[] args) {
        printYearsAndDays(6000000000000L);
    }
}
