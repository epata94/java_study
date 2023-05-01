package chapter12;
class Student1 {
    private String name; // 학생 이름
    private int korean; // 국어 점수
    private int english; // 영어 점수
    private int math; // 수학 점수
    private int studentId; // 학번

    public Student1(String name, int korean, int english, int math, int studentId) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
        this.studentId = studentId;
    }

    public int getTotalScore() { // 총점 구하는 메소드
        return korean + english + math;
    }

    public double getAverageScore() { // 평균 구하는 메소드
        return getTotalScore() / 3.0;
    }

    public String getName() {
        return name;
    }

    public int getKorean() {
        return korean;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    public int getStudentId() {
        return studentId;
    }
}
public class MyObjOverrideV1ToStringV1 {

    public static void main(String[] args) {
        Student1[] students = new Student1[3];
        students[0] = new Student1("김철수", 90, 80, 85, 20190001);
        students[1] = new Student1("박영희", 85, 90, 95, 20190002);
        students[2] = new Student1("이민호", 95, 85, 80, 20190003);

        System.out.println("이름\t\t국어\t영어\t수학\t총점\t평균\t\t학번");
        for (int i = 0; i < students.length; i++) {
// 포멧 스트링
// %s: 문자열 출력, %d: 정수형 데이터 출력, %f: 실수형 데이터 출력, %.1f: .을 기준으로 숫자만큼 소수점이하 처리
            System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%d\n",
                    students[i].getName(),
                    students[i].getKorean(),
                    students[i].getEnglish(),
                    students[i].getMath(),
                    students[i].getTotalScore(),
                    students[i].getAverageScore(),
                    students[i].getStudentId());
        }


    }


}
