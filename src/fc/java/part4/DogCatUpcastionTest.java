package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class DogCatUpcastionTest {
    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.eat();
        Animal ani  = new Dog();
        ani.eat();
        Animal ani1  = new Cat();
        ani1.eat();
    }
   ;
}
