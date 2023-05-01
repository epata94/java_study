package chapter12;
class Student4 {
    private String name; // 학생 이름
    private int korean; // 국어 점수
    private int english; // 영어 점수
    private int math; // 수학 점수
    private String studentId; // 학번

    public Student4(String name, int korean, int english, int math, String studentId) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
        this.studentId = studentId;
    }
    // 검색용 객체를 만들기 위해 생성자 오버로딩
    public Student4(String name, String studentId) {
        this.name = name;
        this.korean = 0;
        this.english = 0;
        this.math = 0;
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

    @Override
    public boolean equals(Object obj) {
        Student4 student = (Student4)obj;
        if (name.equals(student.name) && studentId.equals(student.studentId)) {
            return true;
        }
        return false;
    }

}
public class MyObjOverrideV2EqualsV2 {

    public static void main(String[] args) {
        Student4[] students = new Student4[3];
        students[0] = new Student4("김철수", 90, 80, 85, "20210101");
        students[1] = new Student4("박영희", 85, 90, 95, "20210102");
        students[2] = new Student4("이민호", 95, 85, 80, "20210103");

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
            if (students[i].equals(new Student4(searchName,searchStudentId))) {
                System.out.println(students[i]);
                break;
            }
        }
    }
}
