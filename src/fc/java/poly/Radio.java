package fc.java.poly;

public class Radio implements RemoCon{

    @Override
    public void chUp() {
        System.out.println("라디오 채널이 올라간다.");
    }

    @Override
    public void chDown() {
        System.out.println("라디오 채널이 내려간다.");
    }

    @Override
    public void volumUp() {
        System.out.println("라디오 소리가 올라간다.");
    }

    @Override
    public void volumDown() {
        System.out.println("라디오 소리가 내려간다.");
    }

    @Override
    public void internet() {
        System.out.println("라디오에서는 인터넷 지원이 안됩니다.");
    }
}
