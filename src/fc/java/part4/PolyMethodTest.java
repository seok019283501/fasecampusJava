package fc.java.part4;

import fc.java.model.*;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);
    }
//오버로딩
//    private static void display(Dog d) {
//        d.eat();
//    }
//    private static void display(Cat c) {
//        c.eat();
//    }
    private static void display(Animal ani) {
        ani.eat();
        if(ani instanceof Cat){
            ((Cat) ani).night();
        }
    }
}
