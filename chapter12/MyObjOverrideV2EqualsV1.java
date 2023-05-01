package chapter12;
class Student3 {
    private String name; // 학생 이름
    private int korean; // 국어 점수
    private int english; // 영어 점수
    private int math; // 수학 점수
    private String studentId; // 학번

    public Student3(String name, int korean, int english, int math, String studentId) {
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
    public String getStudentId() {
        return studentId;
    }
    @Override
    public String toString(){
        return String.format("%s\t%d\t%d\t%d\t%d\t%.1f\t%s", name, korean, english, math, getTotalScore(), getAverageScore(), studentId);
    }
}
public class MyObjOverrideV2EqualsV1 {

    public static void main(String[] args) {
        Student3[] students = new Student3[3];
        students[0] = new Student3("김철수", 90, 80, 85, "20210101");
        students[1] = new Student3("박영희", 85, 90, 95, "20210102");
        students[2] = new Student3("이민호", 95, 85, 80, "20210103");

        System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");

        // 모든 학생 정보 출력
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        // 이름과 학번으로 학생 정보 조회
        String searchName = "박영희";
        String searchStudentId = "20210102";
        System.out.println("\n이름이 \"" + searchName + "\"이고 학번이 \"" + searchStudentId + "\"인 학생의 정보:");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(searchName) && students[i].getStudentId().equals(searchStudentId)) {
                System.out.println(students[i]);
                break;
            }
        }
    }


}
