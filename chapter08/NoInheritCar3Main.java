package chapter08;

public class NoInheritCar3Main {
    public static void main(String[] args) {
        NoInheritCar3 myCar = new NoInheritCar3("현대","쏘렌토",2022,true);
        System.out.println(myCar.getModel()+" "+myCar.getCompany()+" "+myCar.getYear()+"년식을 시승하겠습니다.");

        myCar.startEngine();
        if(myCar.isFourWheel()) {
            myCar.driveFourWheel();
        }
        myCar.stopEngine();
    }
}
