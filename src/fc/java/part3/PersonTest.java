package fc.java.part3;

import fc.java.model.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("민석",25,"0104069");
        Person p1 = new Person();

        p.eat();
        p.name();
        p1.name();
        p1.name ="아무개";
        p1.name();
    }
}
