package fc.java.part3;

import fc.java.model.*;

public class CarUtilityTest {
    public static void main(String[] args) {
        //car 정보를 출력하는 동작을 가지고있는 utility 클래스를 설계하세요
        int carSn = 110;
        String carName = "BMW";
        int carPrice = 10000;
        String carOwner = "minseok";
        int carYear = 2020;
        String carType = "G";
        CarDTO car = new CarDTO(carSn,carName,carPrice,carOwner,carYear,carType);
        CarUtility carUtility = new CarUtility();
        carUtility.carPrint(car);
    }

}
