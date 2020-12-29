import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner keyboard = new Scanner(System.in);
        double sum = 0;
        double count = 0;
        double average = 0;
        while(true){
            boolean hasNextInt = keyboard.hasNextInt();
            if(hasNextInt){
                int number = keyboard.nextInt();
                sum = sum + number;
                count++;
                average = sum/count;
            }else {
                break;
            }
            keyboard.nextLine();
        }
        int sumInt = (int)sum;
        double roundedAverage = Math.round(average);
        int roundedAverageInt = (int) roundedAverage;
        System.out.println("SUM = " + sumInt + " AVG = " + roundedAverageInt);
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
//        double sum = 11;
//        double count = 3;
//        double average = sum/count;
//        System.out.println(average);
    }
}
