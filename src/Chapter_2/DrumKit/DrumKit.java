package Chapter_2.DrumKit;

public class DrumKit {

    private boolean hasTopHat = true;
    private boolean hasSnare = true;

    public void setHasTopHat(boolean hasTopHat) {
        this.hasTopHat = hasTopHat;
    }

    public boolean getHasTopHat() {
        return hasTopHat;
    }

    public void setHasSnare(boolean hasSnare) {
        this.hasSnare = hasSnare;
    }

    public boolean getHasSnare() {
        return hasSnare;
    }

    void playSnare() {
        if (hasSnare) {
            System.out.println("bang bang ba-bang");
        }
    }

    void playTopHat() {
        if (hasTopHat) {
            System.out.println("ding ding da-ding");
        }
    }
}
