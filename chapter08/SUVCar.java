package chapter08;

public class SUVCar extends InheritCar1 {
    private boolean isFourWheel; // 4륜 구동여부
    public SUVCar(String company, String model, int year, boolean isFourWheel) {
        super(company, model, year);
        this.isFourWheel = isFourWheel;
    }
    public boolean isFourWheel() {
        return isFourWheel;
    }

    public void driveFourWheel(){
        System.out.println("SUV카를 4륜구동 모드로 달렸습니다.");
    }
}
