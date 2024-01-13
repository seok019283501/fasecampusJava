package fc.java.part3;

import fc.java.model.Person;

public class PersonAccessTest {
    public static void main(String[] args) {
        //Q.Person클래스에 이름, 나이, 전화번호를 저장하고 출력하세요
        Person p = new Person("홍길동",1000,"010-1111-1111");
        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);
    }
}
