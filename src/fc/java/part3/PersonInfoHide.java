package fc.java.part3;

import fc.java.model.*;

public class PersonInfoHide {
    //Q. 한사람의 회원 정보를 저장하는 객체를 생성하세요.\
    public static void main(String[] args) {
        PersonVO vo = new PersonVO("홍길동",50,"010-1111-1111");
        vo.setAge(1000000);
//        vo.name = "홍길동";
//        vo.age = 500000; // 정보은닉 X
//        vo.phone = "010-1111-1111";

    }

}
