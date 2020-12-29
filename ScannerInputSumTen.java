import java.util.Scanner;

public class ScannerInputSumTen {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int validNumberCounter = 0;
        int sum = 0;
        while(validNumberCounter<10){
            int numberCounterName = validNumberCounter+1;
            System.out.println("Enter Number #" + numberCounterName + ":");
            boolean isInt = keyboard.hasNextInt();
            if(isInt){
                int number = keyboard.nextInt();
                sum += number;
                validNumberCounter++;
            }else {
                System.out.println("Invalid Input");
            }
            keyboard.nextLine();    //HANDLE END OF LINE ENTER KEY - not storing the input thus preventing loop
        }
        System.out.println("Sum of 10 Input Numbers : " + sum);

        keyboard.close();
    }
}
