package Chapter_3.Hobbit;

public class HobbitTestDrive {

    public static void main (String[] args) {

        Hobbit[] hobbits = new Hobbit[3];
        int z = 0;

        while (z < hobbits.length) {
            hobbits[z] = new Hobbit();
            hobbits[z].setName("bilbo");
            if (z == 1) {
                hobbits[z].setName("frodo");
            }
            if (z == 2) {
                hobbits[z].setName("sam");
            }

            System.out.print(hobbits[z].getName() + " is a ");
            System.out.println("good Hobbit name");

            z++;
        }
    }
}
