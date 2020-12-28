public class SumOdd {
    public static boolean isOdd(int number){
        if(number<=0){
            return false;
        }else if(number%2 != 0){
            return true;
        }else return false;
    }
    public static int sumOdd(int start, int end){//PARAMETERS REPRESENT A RANGE OF NUMBERS
        int finalSum = 0;
        if(end<start || start<= 0 || end<= 0){
            return -1;
        }
        for(int i = start; i<=end; i++) {
            if(isOdd(i)){
                finalSum +=i;
            }
        }
        return finalSum;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(31,61));
    }
}
