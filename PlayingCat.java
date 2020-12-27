public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if ((45 >= temperature) && (25 <= temperature)) {
                return true;
            } else return false;
        } else if ((35 >= temperature) && (25 <= temperature)) {
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,30));
        System.out.println(isCatPlaying(true,10));  //ERRORTEST
        System.out.println(isCatPlaying(true,50));  //ERRORTEST
        System.out.println(isCatPlaying(false,30));
        System.out.println(isCatPlaying(false,20)); //ERRORTEST
        System.out.println(isCatPlaying(false,40)); //ERRORTEST

    }
}
// IF SUMMER - PLAY BETWEEN 25-45 INCLUSIVE
//IF NOT - PLAY BETWEEN 24-35 INCLUSIVE