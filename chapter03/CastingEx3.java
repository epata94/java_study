package chapter03;

public class CastingEx3 {

	public static void main(String[] args) {
		
		// 강제형변환 예시
		double score = 100;	// double 자료형
		double score3 = 100.00000000;	// double 자료형

		int score2 = (int)score;	// 강제형변환
		int score4 = (int)score2;	// 강제형변환

		System.out.println(score2); // 값의 손실 발생하지 않음
		System.out.println(score3);
		System.out.println(score4);
	}
}
