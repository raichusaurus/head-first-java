package Chapter_7.Animal;

import Chapter_7.Animal.Canine.Dog;
import Chapter_7.Animal.Canine.Wolf;
import Chapter_7.Animal.Feline.Cat;
import Chapter_7.Animal.Feline.Lion;

import java.rmi.activation.ActivationGroup_Stub;

public class AnimalTesting {

    public void main (String[] args) {

        Animal[] animals = new Animal[5];

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Wolf();
        animals[3] = new Hippo();
        animals[4] = new Lion();

        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
            animals[i].roam();
        }
    }
}
