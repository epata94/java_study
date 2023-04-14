package chapter04;

public class OpEx7 {

	public static void main(String[] args) {
		
//		int score = 80; 합격이 되는 조건
		int score = 50; //불합격 되는 조건
		String pass = score >= 60 ? "합격 " : "불합격";
		System.out.println(pass);
		
	}

}
