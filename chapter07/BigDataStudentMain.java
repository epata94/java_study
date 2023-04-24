package chapter07;

public class BigDataStudentMain {
    public static void main(String[] args) {

//        String name = new String("이하늘");
        BigDataStudent student = new BigDataStudent("홍길동", 90, 80, 85);
        double avgScore = student.calculateAvg();
        System.out.println(student.getName() + "의 평균 점수는 " + avgScore + "입니다.");
    }
}
