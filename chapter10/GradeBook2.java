package chapter10;

public class GradeBook2 {
    private Student[] students;
    private int numStudents;

    public GradeBook2(int maxNumStudents) {
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

    private class Student {
        private String name;
        private int[] grades;

        public Student(String name, int[] grades) {
            this.name = name;
            this.grades = grades;
        }

        public String getName() {
            return name;
        }

        public double getAverageGrade() {
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            return (double) sum / grades.length;
        }
    }

    public static void main(String[] args) {
        GradeBook2 book = new GradeBook2(3);

        book.addStudent("홍길동", new int[]{90, 85, 95});
        book.addStudent("김철수", new int[]{80, 75, 70});
        book.addStudent("오맹달", new int[]{95, 90, 100});

        book.printGradeReport();
    }
}
