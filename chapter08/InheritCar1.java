package chapter08;

public class InheritCar1 { // 일반 자동차를 위한 클래스
    // 아래 필드명을 추출하는 과정을 Data Featureing
    private String company; // 제조사
    private String model; // 자동차 모델
    private int year; // 년식

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
        System.out.println("시동을 끄고 반납합니다.");
    }

    public InheritCar1(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.year = year;
    }
}
