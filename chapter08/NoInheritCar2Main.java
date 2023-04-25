package chapter08;

public class NoInheritCar2Main {
    public static void main(String[] args) {
        NoInheritCar2 myCar = new NoInheritCar2("맥라렌","720s",2021,true,true);
        System.out.println(myCar.getModel()+" "+myCar.getCompany()+" "+myCar.getYear()+"년식을 시승하겠습니다.");
        if(myCar.isConvertible()){
            myCar.openCar();
        }

        myCar.startEngine();
        if(myCar.isTurbo()) {
            myCar.sportsDrive();
        }
        myCar.drift();
        myCar.stopEngine();
    }
}
