package chapter07;
// BigDataStudentMain3클래스는 BigDataStudent클래스에서 제공하는 이름과 평균 정보를 소비하는 소비자(Consumer)역할
public class BigDataStudentMain3 {
    public static void main(String[] args) {

//        String name = new String("이하늘");
// 클래스 생성자 : 클래스의 필드를 초기화 하는데 사용한다.
// [클래스명] [객체명] = new [클래스명](); <- 기본 생성자: 필드의 초기화 X
// [클래스명] [객체명] = new [클래스명](매개변수(또는 값)1, 매개변수2, ... 매개변수n); 각각의 매개변수를 활용하여 클래스 필드를 초기화한다.
        BigDataStudent2 student1 = new BigDataStudent2("홍길동", 90, 80, 85);
        BigDataStudent2 student2 = new BigDataStudent2("김철수", 90, 100, 85);
        BigDataStudent2 student3 = new BigDataStudent2("이영희", 90, 75, 100);
        BigDataStudent2[] students = {student1, student2, student3};

        for (BigDataStudent2 student : students) {
            double avgScore = student.calculateAvg();
//            System.out.println(student.getName() + "의 평균 점수는 " + avgScore + "입니다.");
            System.out.println(student.getName() + "의 평균 점수는 " + avgScore + "입니다.");
        }
    }
}
