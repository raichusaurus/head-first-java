package Chapter_4.Dog;

public class DogTestDrive {

    public static void main (String[] args) {

        Dog one = new Dog();
        one.setSize(70);

        Dog two = new Dog();
        two.setSize(8);

        Dog three = new Dog();
        three.setSize(35);

        Dog[] dogs = {one, two, three};

        for (int i = 0; i < dogs.length; i++) {
            Dog dog = dogs[i];
            dog.bark();
            dog.bark(i);
        }
    }
}
