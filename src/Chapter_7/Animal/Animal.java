package Chapter_7.Animal;

import Chapter_7.Tools.IntPair;

public class Animal {

    private String food;
    private int hunger;
    private IntPair boundaries;
    private IntPair coordinates;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public IntPair getBoundaries() {
        return boundaries;
    }

    public void setBoundaries(IntPair boundaries) {
        this.boundaries = boundaries;
    }

    public IntPair getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(IntPair coordinates) {
        this.coordinates = coordinates;
    }

    public void makeNoise() {
    }

    public void eat() {
    }

    public void sleep() {
    }

    public void roam() {
    }
}
