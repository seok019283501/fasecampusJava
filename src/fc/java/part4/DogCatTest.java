package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class DogCatTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        Cat cat = new Cat();
        cat.eat();
        cat.night();
        Animal x = new Dog();
        x.eat();
    }
}
