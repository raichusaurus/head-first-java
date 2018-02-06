package Chapter_5_6.SimpleDotComGame;

public class SimpleDotComGame {

    public static void main (String[] args) {

        int numGuesses = 0;

        GameHelper helper = new GameHelper();

        DotCom theDotCom = new DotCom();
        int randNum = (int) (Math.random() * 5);
        int[] locations = {randNum, randNum + 1, randNum + 2};
        theDotCom.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive) {

            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numGuesses + " guesses");
            }
        }
    }
}
