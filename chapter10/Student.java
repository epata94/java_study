package chapter10;

public class Student {
    private String name; // 학생 이름
    private int[] grades; // 국,영,수 점수

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public double getAverageGrade() { // 평균 점수를 구하는 서비스 제공
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
}
