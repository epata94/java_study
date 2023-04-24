package chapter07;

public class BigDataStudentMain2 {
    public static void main(String[] args) {

//        String name = new String("이하늘");
// 클래스 생성자 : 클래스의 필드를 초기화 하는데 사용한다.
// [클래스명] [객체명] = new [클래스명](); <- 기본 생성자: 필드의 초기화 X
// [클래스명] [객체명] = new [클래스명](매개변수(또는 값)1, 매개변수2, ... 매개변수n); 각각의 매개변수를 활용하여 클래스 필드를 초기화한다.
        BigDataStudent student1 = new BigDataStudent("홍길동", 90, 80, 85);
        BigDataStudent student2 = new BigDataStudent("김철수", 90, 100, 85);
        BigDataStudent student3 = new BigDataStudent("이영희", 90, 75, 100);
        BigDataStudent[] students = {student1, student2, student3};

        for (BigDataStudent student : students) {
            double avgScore = student.calculateAvg();
            System.out.println(student.getName() + "의 평균 점수는 " + avgScore + "입니다.");
        }
    }
}
