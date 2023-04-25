package chapter08;

public class NoInheritCar1Main {
    public static void main(String[] args) {
        NoInheritCar1 myCar = new NoInheritCar1("현대","아반떼",2020);
        System.out.println(myCar.getModel()+" "+myCar.getCompany()+" "+myCar.getYear()+"년식을 시승하겠습니다.");
        myCar.startEngine();
        myCar.drive();
        myCar.stopEngine();
    }
}
