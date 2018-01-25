package Chapter_2.DVDPlayer;

public class DVDPlayerTestDrive {

    public static void main(String[] args) {

        DVDPlayer d = new DVDPlayer();
        d.setCanRecord(true);
        d.playDVD();
        d.recordDVD();
    }
}
