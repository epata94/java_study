package chapter04;

public class OpEx7 {

	public static void main(String[] args) {

		int score = 80; // 합격이 되는 조건
//		int score = 50; //불합격 되는 조건
//		String pass = score >= 60 ? "합격 " : "불합격";
//		System.out.println(pass);
// 	위 삼항 연산자는 아래와 바꿀수 있다.
		String pass;
		// if 아래 블록에 명령어가 1개 일 경우 {} 생략 가능
		// 하지만 두 줄이 되는 상황에서 에러를 발생할 가능성이 있으므로
		// 1줄 명령어라도 반드시 {} 사용하는 습관을 들이자.
		if (score >= 60) {
			pass = "합";
			pass += "격"; // pass = pass +"격"
		}else
			pass = "불합격";

		System.out.println(pass);
	}

}
