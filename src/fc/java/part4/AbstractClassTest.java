package fc.java.part4;

import fc.java.poly.*;

public class AbstractClassTest {
    public static void main(String[] args) {
        //추상클래스는 단독으로 객체를 생성 ㅊ불가
//        Animal ani = new Animal();//단독으로 객체 생성 불가
        Animal ani = new Dog();
        ani.eat();
        ani.move();
        ani = new Cat();
        ani.eat();
        ani.move();
        ((Cat)ani).night();
    }
}
