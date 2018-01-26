package Chapter_3.Hobbit;

public class HobbitTestDrive {

    public static void main (String[] args) {

        Hobbit[] h = new Hobbit[3];
        int z = 0;

        while (z < 2) {
            z = z + 1;
            h[z] = new Hobbit();
            h[z].setName("bilbo");
            if (z == 1) {
                h[z].setName("frodo");
            }
            if (z == 2) {
                h[z].setName("sam");
            }

            System.out.print(h[z].getName() + " is a ");
            System.out.println("good Hobbit name");
        }
    }
}
