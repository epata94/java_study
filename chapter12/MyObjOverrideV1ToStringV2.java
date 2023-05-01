package chapter12;
class Student2 {
    private String name;
    private int korean;
    private int english;
    private int math;
    private int studentId;

    public Student2(String name, int korean, int english, int math, int studentId) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
        this.studentId = studentId;
    }

    public int getTotalScore() {
        return korean + english + math;
    }

    public double getAverageScore() {
        return getTotalScore() / 3.0;
    }

    @Override
    public String toString(){
        return String.format("%s\t%d\t%d\t%d\t%d\t%.1f\t%d", name, korean, english, math, getTotalScore(), getAverageScore(), studentId);
    }
}
public class MyObjOverrideV1ToStringV2 {

    public static void main(String[] args) {
        Student2[] students = new Student2[3];
        students[0] = new Student2("김철수", 90, 80, 85, 20190001);
        students[1] = new Student2("박영희", 85, 90, 95, 20190002);
        students[2] = new Student2("이민호", 95, 85, 80, 20190003);

        System.out.println("이름\t\t국어\t영어\t수학\t총점\t평균\t\t학번");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }


        class Student {
            private String name;
            private int korean;
            private int english;
            private int math;
            private int studentId;

            public Student(String name, int korean, int english, int math, int studentId) {
                this.name = name;
                this.korean = korean;
                this.english = english;
                this.math = math;
                this.studentId = studentId;
            }

            public int getTotalScore() {
                return korean + english + math;
            }

            public double getAverageScore() {
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
    }


}
