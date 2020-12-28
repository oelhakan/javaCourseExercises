public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
//bigCount = big flour bags - 5kgs each
        //smallCount = small flour bags - 1kgs each
        //goal represents the goal amount of kilos of flour needed to assemble a package
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int mustHaveBig = goal/5;
//        System.out.println("musthavebig = " + mustHaveBig);
        if(goal>5){
            if(bigCount>=mustHaveBig){
                if(goal - mustHaveBig*5 >0){
                    if(smallCount >= goal-mustHaveBig*5){
                        return true;
                    }else return false;
                }else if(goal - mustHaveBig*5 ==0){
                    return true;
                }else return false;
            }if((bigCount*5+smallCount>=goal) || smallCount>= goal){
                return true;
            }else return false;
        }else if(goal == 5){
            if(bigCount>= 1 || smallCount>= 5){
                return true;
            }else return false;
        } else if(goal<5){
            if(smallCount>= goal){
                return true;
            }else return false;
        }else return false;
    }
    public static void main(String[] args) {
            System.out.println(canPack(1,0,4));
          System.out.println(canPack(5,3,24));
            System.out.println(canPack(0,5,4));
            System.out.println(canPack(2,2,11));
            System.out.println(canPack(-3,2,12));
            System.out.println(canPack(1,0,6));
    }
}
