public class SecondsAndMinutes {
    public static String getDurationString(int minutes, int seconds){
        if(minutes<0 || seconds<0 || seconds>59){
            return "Invalid Value";
        }else{
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
//            return (hours + "h " + remainingMinutes + "m " + seconds + "s");
            return (String.format("%02d h %02d m %02d s", hours, remainingMinutes, seconds));
        }

}
    public static String getDurationString(int seconds){
        if(seconds<0){
            return "Invalid Value";
        }else{
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(560, 40));    //560 MINUTES AND 40 SECONDS EQUALS TO
        System.out.println(getDurationString(600000)); //600000 SECONDS ARE EQUAL TO
        System.out.println(getDurationString(160, -100));   //errortest
        System.out.println(getDurationString(160, 6000000));    //errortest
        System.out.println(getDurationString(-100000));   //errortest
        System.out.println(getDurationString(61));   //string format test


    }
}
