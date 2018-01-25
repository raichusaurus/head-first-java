package Chapter_2.TapeDeck;

public class TapeDeck {

    private boolean canRecord = false;

    public void setCanRecord(boolean canRecord) {
        this.canRecord = canRecord;
    }

    void playTape() {
        System.out.println("tape playing");
    }

    void recordTape() {
        if (canRecord) {
            System.out.println("tape recording");
        }
    }
}
