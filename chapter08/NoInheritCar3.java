package chapter08;

public class NoInheritCar3 { // SUV 자동차를 위한 클래스
    // 아래 필드명을 추출하는 과정을 Data Featureing
// --------------- 필드부 -----------------------
    private String company; // 제조사
    private String model; // 자동차 모델
    private int year; // 년식



    private boolean isTurbo; // 터보엔진 유무
    private boolean isConvertible; // 컨버터블 동작가능 여부



    private boolean isFourWheel; // 4륜 구동여부

//  ------------- 메소드부 -----------------------
    public boolean isFourWheel() {
        return isFourWheel;
    }
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


    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void startEngine(){
        System.out.println("시동을 걸었습니다.");
    }

    public void drive(){
        System.out.println("시승을 하였습니다.");
    }

    public void stopEngine(){
        System.out.println("시동을 끕니다.");
    }

    public void driveFourWheel(){
        System.out.println("SUV카를 4륜구동 모드로 달렸습니다.");
    }


    public NoInheritCar3(String company, String model, int year, boolean isTurbo, boolean isConvertible) {
        this.company = company;
        this.model = model;
        this.year = year;
        this.isTurbo = isTurbo;
        this.isConvertible = isConvertible;
    }
    public NoInheritCar3(String company, String model, int year, boolean isFourWheel) {
        this.company = company;
        this.model = model;
        this.year = year;
        this.isFourWheel = isFourWheel;
    }
}
