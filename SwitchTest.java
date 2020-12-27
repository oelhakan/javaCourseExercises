public class SwitchTest {
    public static void main(String[] args) {
        char Answer = 'C';

        switch(Answer){
            case 'A' : case 'B' : case 'C' : case 'D': case 'E':
                System.out.println(Answer + " WAS FOUND");
                break;
                default :
                System.out.println("A,B,C,D,E NOT FOUND");
                break;
        }
    }

}
