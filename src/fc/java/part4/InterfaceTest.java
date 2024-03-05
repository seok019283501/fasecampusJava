package fc.java.part4;

import fc.java.poly.*;

public class InterfaceTest {
    public static void main(String[] args) {
        //리모콘으로 티비 동작
        RemoCon remoCon = new Radio();
        remoCon.chUp();
        remoCon.chDown();
        remoCon.volumUp();
        remoCon.volumDown();
        remoCon.internet();// ? 오동작

        remoCon = new TV();
        remoCon.chUp();
        remoCon.chDown();
        remoCon.volumUp();
        remoCon.volumDown();
        remoCon.internet();// ? 오동작
    }
}
