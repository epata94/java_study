package chapter06;

public class P127 {
    public static void main(String[] args) {
        // 1차원 배열: 동일한 성격의 데이터를 구성
        // 예) myScore: 나의 국어, 영어, 수학 점수
        int[] myScore={100,95,90}; // 1차원 배열

        // N차원 배열은 데이터를 N의 관점별로 나열할 수 있다.
        // 예) classAScore: 우리반 국어, 영어, 수학 점수
        int[][] classAScore={
                {100,95,90},    // 철수의 국영수 점수
                {90,95,90},     // 만수의 국영수 점수
                {100,95,100},   // 영희의 국영수 점수
                {100,95,95},    // 민정의 국영수 점수
        };
    }
}
