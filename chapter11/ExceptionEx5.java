package chapter11;

public class ExceptionEx5 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			// 사용자가 특정 목적에 의해서 예외 상황을 강제로 발생시키고자 할 때
//			throw new Exception("예외 발생"); // 사용자 정의 예외 메세지를 정의
			int result = 1/0;
		} catch (Exception e) {
			// getMessage(): 예외에서 정의한 메세지를 출력
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		System.out.println("프로그램 종료");
	}
	
}
