package fc.java.part4;

import fc.java.model.*;


public class ObjectCasting {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();
        ani = new Cat();
        ani.eat();
//        ani.night(); //다운케스팅을 하면 가능하다
    }
}
