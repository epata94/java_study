package chapter08;

public class SportsCar extends InheritCar1 {
    private boolean isTurbo; // 터보엔진 유무
    private boolean isConvertible; // 컨버터블 동작가능 여부

    public boolean isTurbo() {
        return isTurbo;
    }
    public boolean isConvertible() {
        return isConvertible;
    }
    public void sportsDrive(){
        System.out.println("스포츠카를 터보모드로 운전했습니다.");
    }

    public void drift(){
        System.out.println("스포츠카로 드리프팅을 하였습니다.");
    }

    public void openCar(){
        System.out.println("스포츠카를 컨버터블 모드로 오픈합니다.");
    }

    public SportsCar(String company, String model, int year, boolean isTurbo, boolean isConvertible) {
        super(company, model, year);
        this.isTurbo = isTurbo;
        this.isConvertible = isConvertible;
    }
}
