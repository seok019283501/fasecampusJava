package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO();
        PersonVO vo1 = new PersonVO("홍길동",10,"010-1111-1111");
        System.out.println(vo.toString());
        System.out.println(vo1.toString());
    }
}
