package Chapter_1;

public class Loopy {

    public static void main (String[] args) {

        int x = 1;
        System.out.println("Before the loop");
        while (x < 4) {
            System.out.println("During the loop");
            System.out.println("Value of x is " + x);
            x = x + 1; /// ugh
        }

        System.out.println("After the loop");
    }
}
