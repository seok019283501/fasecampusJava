package fc.java.part4;

import fc.java.poly.*;

public class IsNotOverride {
    public static void main(String[] args) {
        //재정의가 되지 않아 다형서잉 보장되지 않는다. -> 강제로 재정의를 하게 한다.
        //그게 추상클래스와 인터페이스다
        Animal ani = new Dog();
        ani.eat();
        ani = new Cat();
        ani.eat();
    }
}
