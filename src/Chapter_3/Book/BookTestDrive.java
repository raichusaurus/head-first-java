package Chapter_3.Book;

public class BookTestDrive {

    public static void main (String[] args) {

        Book[] myBooks = new Book[3];

        int x = 0;
        while(x < 3) {
            myBooks[x] = new Book();
            x++;
        }

        myBooks[0].setTitle("The Grapes of Java");
        myBooks[1].setTitle("The Java Gatsby");
        myBooks[2].setTitle("The Java Cookbook");

        myBooks[0].setAuthor("bob");
        myBooks[1].setAuthor("sue");
        myBooks[2].setAuthor("ian");

        x = 0;
        while (x < 3) {
            System.out.print(myBooks[x].getTitle());
            System.out.print(" by ");
            System.out.println(myBooks[x].getAuthor());
            x++;
        }
    }
}
