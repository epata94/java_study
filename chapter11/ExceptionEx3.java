package chapter11;

public class ExceptionEx3 {

	public static void main(String[] args) {
		System.out.println("DB연결 시작");
		try {
			System.out.println("DB작업");
			System.out.println(3/0);
			System.out.println("Try 블록 종료");
		} catch(Exception e) {
			System.out.println("DB작업 중 예외발생");
		} finally { // 예외 상황과 상관없이 항상 수행되는 블록이다.
			System.out.println("DB연결 종료");
		}
	}

}
