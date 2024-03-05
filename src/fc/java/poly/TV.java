package fc.java.poly;

public class TV extends RemoCon{

    @Override
    public void chUp() {
        System.out.println("TV 채널이 올라간다.");
    }

    @Override
    public void chDown() {
        System.out.println("TV 채널이 내려간다.");
    }

    @Override
    public void volumUp() {
        System.out.println("TV 소리가 올라간다.");
    }

    @Override
    public void volumDown() {
        System.out.println("TV 소리가 내려간다.");
    }
}
