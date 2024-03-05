package fc.java.part4;

import fc.java.poly.*;

public class InterfaceTest {
    public static void main(String[] args) {
        //리모콘으로 티비 동작
        //부모가 인터페이스면 자식의 내부 동작을 전혀 몰라도 동작을 시킬수 있다.
        RemoCon remoCon = new Radio();
        remoCon.chUp();
        remoCon.chDown();
        remoCon.volumUp();
        remoCon.volumDown();
        remoCon.internet();

        remoCon = new TV();
        remoCon.chUp();
        remoCon.chDown();
        remoCon.volumUp();
        remoCon.volumDown();
        remoCon.internet();
    }
}
