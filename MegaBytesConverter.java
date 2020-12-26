public class MegaBytesConverter {       //1 MB = 1024 KB
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes % 1024;
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }else{
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB" );}
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2080);
        printMegaBytesAndKiloBytes(-2080);
    }
}
