package Chapter_2.DrumKit;

public class DrumKitTestDrive {

    public static void main(String[] args) {

        DrumKit d = new DrumKit();

        d.playSnare();
        d.setHasSnare(false);
        d.playSnare();
        d.playTopHat();
    }
}
