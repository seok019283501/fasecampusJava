package fc.java.part3;
import fc.java.model.*;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        //자동차 정보를 키보드로 부터 입력을 받아 DB에 저장을 하세요.
        Scanner scan = new Scanner(System.in);

        System.out.println("자동차 일련번호 : ");
        int carSn = scan.nextInt();
        scan.nextLine();

        System.out.println("자동차 이름 : ");
        String carName = scan.nextLine();

        System.out.println("자동차 가격 : ");
        int carPrice = scan.nextInt();
        scan.nextLine();

        System.out.println("자동차 소유자 : ");
        String carOwner = scan.nextLine();

        System.out.println("자동차 년식 : ");
        int carYear = scan.nextInt();
        scan.nextLine();

        System.out.println("자동차 타입 : ");
        String carType = scan.nextLine();
        CarDTO car = new CarDTO(carSn,carName,carPrice,carOwner,carYear,carType);
        CarDAO dao = new CarDAO();
        dao.carInsert(car);

    }
}
