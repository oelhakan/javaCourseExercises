public class IsEvenNumber {
    public static boolean isEvenNumber(int number){
        if(number%2 == 0){
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        int number = 4;
        int finish = 20;
        int evenCount = 0;
        while(number <= finish){
            if(isEvenNumber(number)){
                System.out.println(number + " is an even number inside the given interval.");
                evenCount++;
            }
            if(evenCount>=5){
                break;
            }
            number++;
        }
        System.out.println("Count of even numbers found : " + evenCount);
    }
}
