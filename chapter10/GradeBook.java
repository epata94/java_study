package chapter10;

public class GradeBook {
    private Student[] students;
    private int numStudents;

    public GradeBook(int maxNumStudents) {
        students = new Student[maxNumStudents];
        numStudents = 0;
    }

    public void addStudent(String name, int[] grades) {
        if (numStudents < students.length) {
            students[numStudents] = new Student(name, grades);
            numStudents++;
        }
    }

    public void printGradeReport() {
        for (int i = 0; i < numStudents; i++) {
            System.out.println(students[i].getName() + ": " + students[i].getAverageGrade());
        }
    }

    public static void main(String[] args) {
        GradeBook book = new GradeBook(3);

        book.addStudent("홍길동", new int[]{90, 85, 95});
        book.addStudent("김철수", new int[]{80, 75, 70});
        book.addStudent("오맹달", new int[]{95, 90, 100});

        book.printGradeReport();
    }
}
