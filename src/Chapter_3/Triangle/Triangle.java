package Chapter_3.Triangle;

public class Triangle {

    private double area;
    private int height;
    private int length;

    void setArea() {
        setArea((getHeight() * getLength()) / 2);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
