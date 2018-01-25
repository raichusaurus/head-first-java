package Chapter_2.Guessing_Game;

public class Player {

    int number = 0; // should be private and have a getter

    // guess should probably return an int, but just following the example
    public void guess() {
        number = (int) (Math.random() * 10); // not a fan of hardcoding the 10 here
        System.out.println("I'm guessing " + number);
    }
}
