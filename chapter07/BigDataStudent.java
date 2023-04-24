package chapter07;

// Alt+7 : 클래스의 Structure View
public class BigDataStudent {
    String name;
    int korScore;
    int engScore;
    int mathScore;

    // 생성자
    public BigDataStudent(String name, int korScore, int engScore, int mathScore) {
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
