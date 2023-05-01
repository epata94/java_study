package chapter12;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 이름, 국어, 영어, 수학 점수 입력 받기
        System.out.print("이름과 국어, 영어, 수학 점수를 입력하세요(예: 홍길동 90 85 95): ");
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        String name = inputs[0];
        int kor = Integer.parseInt(inputs[1]);
        int eng = Integer.parseInt(inputs[2]);
        int math = Integer.parseInt(inputs[3]);

        // 평균 점수 계산하기
        double avg = (kor + eng + math) / 3.0;

        // 입력 받은 정보 출력하기
        System.out.println("이름: " + name);
        System.out.println("국어 점수: " + kor);
        System.out.println("영어 점수: " + eng);
        System.out.println("수학 점수: " + math);
        System.out.println("평균 점수: " + avg);
    }
}
