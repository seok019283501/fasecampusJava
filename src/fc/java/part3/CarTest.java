package fc.java.part3;

import java.util.Scanner;
import fc.java.model.*;

public class CarTest {
    public static void main(String[] args) {
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

    }

}
