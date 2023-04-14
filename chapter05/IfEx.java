package chapter05;

public class IfEx {

	public static void main(String[] args) {
		
		int score = 60;
		
		System.out.println("시험 시작");
		if (score >= 60) { // 참인 경우에 대한 처리만 할 경우
			System.out.println("합격입니다.");
		}
		System.out.println("시험 끝");

	}

}
