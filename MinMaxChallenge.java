import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int min = 0;
        int max = 0;
//        int maxMax = Integer.MIN_VALUE;           second solution for overcoming the min 0 bug
//        int minMin = Integer.MAX_VALUE;
        boolean isFirst = true;
        while(true){
            System.out.println("Enter Number: ");
            boolean isInt = keyboard.hasNextInt();
            if(isInt){
                int number = keyboard.nextInt();
                if(isFirst){
                    min = number;
                    max = number;
                    isFirst = false;
                }
                if(number<min){
                    min = number;
                }
                if(number>0){
                    max = number;
                }
            }else {
                break;  //Program ends when input value is invalid.
            }
            keyboard.nextLine();    //HANDLE END OF LINE ENTER KEY - not storing the input thus preventing loop
        }
        System.out.println("Maximum number from the inputs : " + max + ". Minimum number from the inputs : " + min + ".");

        keyboard.close();
    }
}
