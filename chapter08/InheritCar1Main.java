package chapter08;

public class InheritCar1Main {
    public static void main(String[] args) {
        InheritCar1 myCar = new InheritCar1("현대","아반떼",2020);
        System.out.println(myCar.getModel()+" "+myCar.getCompany()+" "+myCar.getYear()+"년식을 시승하겠습니다.");
        myCar.startEngine();
        myCar.drive();
        myCar.stopEngine();
    }
}
