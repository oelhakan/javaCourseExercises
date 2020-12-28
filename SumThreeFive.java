public class SumThreeFive {
    public static void main(String[] args) {
        int sumOfAll = 0;
        int count = 0;
        for(int i = 1; i<1001; i++){
            if((i%3 == 0) && (i%5 == 0)){
                System.out.println(i + " is evenly divisible by both 3 and 5");
                sumOfAll += i;
                count++;
            }
            if(count == 5){
                System.out.println("Sum of the first three number evenly divisible by both 3 and 5 = " + sumOfAll);
                break;
            }
        }
    }
}
