package Chapter_2.DVDPlayer;

public class DVDPlayer {

    private boolean canRecord = false;

    public void setCanRecord(boolean canRecord) {
        this.canRecord = canRecord;
    }

    void playDVD() {
        System.out.println("DVD playing");
    }

    void recordDVD() {
        System.out.println("DVD recording");
    }
}
