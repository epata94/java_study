package chapter05;

public class IfEx2 {

	public static void main(String[] args) {
		
		int score = 80;
		String grade = "";
		
		System.out.println("학점부여 시작");
		if (score >= 95) {
			grade = "A+";
		} else if (score >= 90){ // 선행 if나 else if의 조건이 false 일 때 추가 조건을 지정할 수 있다.
			grade = "A";
		} else if (score >= 85) {
			grade = "B+";
		} else if (score >= 80) {
			// 조건을 만족하면 if-else if -else 블록을 빠져나온다.
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else { // 앞에 있는 모든 if와 else if 조건을 만족하지 않은 경우, Default(기본값) 처리 로직에 주로 사용
			grade = "F";
		}
		System.out.println("당신의 학점은 "+grade+"입니다.");
		System.out.println("학점부여 끝");

	}

}
