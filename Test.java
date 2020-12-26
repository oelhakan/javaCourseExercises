
// call both methods and display the results of the following
// a score of 1500, 900, 400 and 50
//

public class Test {
    public static void main(String[] args) {
        String name1 = "Onur";
        String name2 = "Alexander";
        String name3 = "Thomas";
        String name4 = "Billy";

        displayHighScorePosition(name1, calculateHighScorePosition(1500));
        displayHighScorePosition(name2, calculateHighScorePosition(900));
        displayHighScorePosition(name3, calculateHighScorePosition(400));
        displayHighScorePosition(name4, calculateHighScorePosition(50));
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
            return 4;

    }

    public static void displayHighScorePosition(String playerName, int positionInHighScoreTable) {
        System.out.println(playerName + " has managed to get into position " + positionInHighScoreTable + " on the high score table!");

    }
}
