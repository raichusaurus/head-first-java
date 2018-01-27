package Chapter_3.Triangle;

public class TriangleTestDrive {

    public static void main (String[] args) {

        int x = 0;
        Triangle[] ta = new Triangle[4];

        while (x < 4) {
            ta[x] = new Triangle();
            ta[x].setHeight((x + 1) * 2);
            ta[x].setLength(x + 4);
            ta[x].setArea();
            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].getArea());
            x = x + 1;
        }

        int y = x;
        x = 27;
        Triangle t5 = ta[2];
        ta[2].setArea(343);
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.getArea());
    }
}
