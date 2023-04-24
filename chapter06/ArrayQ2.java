package chapter06;
import java.util.Scanner;
public class ArrayQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];

        // 점수 입력 받기
        for (int i = 0; i < scores.length; i++) {
            System.out.print("학생 " + (i+1) + "의 점수를 입력하세요: ");
            scores[i] = sc.nextInt();
        }

        // 최고점과 최저점 구하기
        int maxScore = scores[0];
        int minScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
            if (scores[i] < minScore) {
                minScore = scores[i];
            }
        }

        // 결과 출력
        System.out.println("최고점: " + maxScore);
        System.out.println("최저점: " + minScore);
    }
}
