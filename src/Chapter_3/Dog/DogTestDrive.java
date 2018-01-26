package Chapter_3.Dog;

public class DogTestDrive {

    public static void main (String[] args) {

        // make a Dog object and access it
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.setName("Bart");

        // now make a Dog array
        Dog[] myDogs = new Dog[3];
        // and put some dogs in it
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // now access the Dogs using the array
        // references
        myDogs[0].setName("Fred");
        myDogs[1].setName("Marge");

        // hmm... what is myDogs[2] name?
        System.out.print("last dog's name is ");
        System.out.println(myDogs[2].getName());

        // now loop through the array
        // and tell all the dogs to bark
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x++;
        }
    }
}
