package fc.java.part3;

import fc.java.model.PersonVO;

public class SetterGetterTest {
    // Q. setter getter 메서드를 통해 PersonVO객체의 이름, 나이, 전화번호를 저장하고 출력;
    public static void main(String[] args) {
        PersonVO vo = new PersonVO();
        vo.setAge(50);
        vo.setName("홍길동");
        vo.setPhone("010-1111-1111");
        System.out.println(vo.getName()+vo.getPhone()+vo.getAge());

    }

}
