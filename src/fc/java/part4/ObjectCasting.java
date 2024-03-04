package fc.java.part4;

import fc.java.model.*;


public class ObjectCasting {
    public static void main(String[] args) {
        Animal ani = new Dog(); // 업케스팅
        ani.eat();
        ani = new Cat();
        ani.eat();
//        ani.night(); //다운케스팅을 하면 가능하다
//        Cat c = (Cat)ani; //다운케스팅
//        c.night();
        ((Cat)ani).night();
    }
}
