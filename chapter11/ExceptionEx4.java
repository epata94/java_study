package chapter11;

public class ExceptionEx4 {

	public static void main(String[] args) {
		System.out.println("DB연결 시작");
		try {
			System.out.println("DB작업");
			System.out.println(3/0); // DB관련 작업 가정
			System.out.println("Try 블록 종료");
		} catch(Exception e) {
			System.out.println("DB작업 중 예외발생");
		} finally {
			// DB에러가 발생된 상황에서도 finally 구문은 실행
			// 이러한 상황에서 아래 finally 구문이 실행될 수 없는 상황도 존재한다.
			// 그럴 경우에 finally 블록역시 보호할 필요도 있다.
			try {
				System.out.println("DB연결 종료");
			}catch (Exception ex){
				System.out.println("DB연결 종료중 에러 발생");
			}
		}
	}

}
