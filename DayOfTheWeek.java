import java.util.Scanner;

public class DayOfTheWeek {
//    public static void printDayOfTheWeek(){
//        System.out.println("Enter the day of the week in number! (1-7)");
//        Scanner keyboard = new Scanner(System.in);
//        int dayOfWeek = keyboard.nextInt();
//        keyboard.close();
//
//        switch(dayOfWeek){
//            case 1:
//                System.out.println("It's Monday!");
//                break;
//            case 2 :
//                System.out.println("It's Tuesday!");
//                break;
//            case 3 :
//                System.out.println("It's Wednesday!");
//                break;
//            case 4 :
//                System.out.println("It's Thursday!");
//                break;
//            case 5 :
//                System.out.println("It's Friday!");
//                break;
//            case 6 :
//                System.out.println("It's Saturday!");
//                break;
//            case 7 :
//                System.out.println("It's Sunday!");
//                break;
//            default :
//                System.out.println("Invalid Input");
//                break;
//        }
//
//    }

    public static void printDayOfTheWeek() {
        System.out.println("Enter the day of the week in number! (1-7)");
        Scanner keyboard = new Scanner(System.in);
        int dayOfWeek = keyboard.nextInt();
        keyboard.close();

        if (dayOfWeek == 1) {
            System.out.println("It's Monday!");
        } else if (dayOfWeek == 2) {
            System.out.println("It's Tuesday!");
        } else if (dayOfWeek == 3) {
            System.out.println("It's Wednesday!");
        } else if (dayOfWeek == 4) {
            System.out.println("It's Thursday!");
        } else if (dayOfWeek == 5) {
            System.out.println("It's Friday!");
        } else if (dayOfWeek == 6) {
            System.out.println("It's Saturday!");
        } else if (dayOfWeek == 7) {
            System.out.println("It's Sunday!");
        }else System.out.println("Invalid Input");

    }

    public static void main(String[] args) {
        printDayOfTheWeek();
    }
}
