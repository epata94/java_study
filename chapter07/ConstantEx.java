package chapter07;

public class ConstantEx {
	//	상수는 관례상 대문자로 표기하는 형식의 Sanke 방식으로 작성한다.
	static final double CARD_COMMISSION = 1.5;
	public static final double MY_PI = 3.141592;

	public static void main(String[] args) {
		
		System.out.println("원주율 : "+Math.PI);
		System.out.println("카드 수수료율 : "+CARD_COMMISSION);
		//		 CARD_COMMISSION = 1.8; // 에러

	}

}
