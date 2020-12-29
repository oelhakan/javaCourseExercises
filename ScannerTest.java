import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.next();
        System.out.println("Enter your birth year: ");
        boolean hasNextInt = keyboard.hasNextInt();
        if(hasNextInt){
        int yearOfBirth = keyboard.nextInt();
            int age = 2020-yearOfBirth;
            if(age<0 || age>100){
                System.out.println("Invalid Birth Year. Please Enter A Year Between 0000-2020");
            }else{
                System.out.println("Your name is " + name + ". You are " + age + " years old.");}
        }else {
            System.out.println("Invalid Birth Year. Please Make Sure Your Input Is An Integer");
        }
        keyboard.close();

    }
}
