package fc.java.part4;

public class EmployTest {
    public static void main(String[] args) {
        //일반사원객체를 생성하고 데이터를 출력;
        RempVO vo = new RempVO("홍길동",35,"010-1111-1111","2022-10-10","기획",true);
        System.out.println(vo.toString());
    }
}
