package chapter07;
// BigDataStudent2 클래스는 정보와 기능(이름, 평균점수) 을 제공하는 Provider 역할
// Provider입장에서는 제공하는 정보를 이름, 평균점수로 제한하고 싶다.
// 평균점수를 계산하는데 필요한 국영수 점수의 제공은 엄격히 금지하고 싶다.
// 이름정보도 필요한 경우 필요한 인터페이스에 의해서만 허가하고 싶다.
// Alt+7 : 클래스의 Structure View
public class BigDataStudent2 {
    private String name; // 객체지향에서 정보의 은닉화
    private int korScore;
    private int engScore;
    private int mathScore;

    // 생성자
    public BigDataStudent2(String name, int korScore, int engScore, int mathScore) {
        // this: 클래스 자신의 필드 접근자, 매개변수와 구별하기 위해서
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    // 멤버 메소드
    public double calculateAvg() {
        return (korScore + engScore + mathScore) / 3.0;
    }
    public String getName() {
        return name;
    }

}
