public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(barking){
            if((0<=hourOfDay && hourOfDay<8) || (hourOfDay>22 && hourOfDay<24)){
                return true;
            }else return false;
        }else return false;
    }
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 0));
//        System.out.println(shouldWakeUp(true,20));
    }
}
