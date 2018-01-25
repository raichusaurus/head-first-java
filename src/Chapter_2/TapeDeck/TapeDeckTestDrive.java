package Chapter_2.TapeDeck;

public class TapeDeckTestDrive {

    public static void main(String[] args) {

        TapeDeck t = new TapeDeck();
        t.setCanRecord(true);
        t.playTape();
        t.recordTape();
    }
}
