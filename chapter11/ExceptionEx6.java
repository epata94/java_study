package chapter11;

public class ExceptionEx6 {

	public static void main(String[] args) {
		try {
			first();
		} catch (Exception e) {
			// 실무에서는 예외처리하는 코드가 훨씬 복잡하다. 따라서 이 영역은 폭탄처리의 영역이다.
			System.out.println(e.getMessage());
		}
		// 아래와 같이 throws Exception 구문이 있는 메소드를 호출시 이에 대한 예외처리(try/catch)를 해주지 않는다면
		// Java에서는 컴파일 에러를 발생한다. => 반드시 예외처리를 하도록 강제하고 있다.
//		first();
	}
	
	static void first() throws Exception {
		second();
	}

	//
	static void second() throws Exception {
		int result = 1/0;
//		throw new Exception("예외 발생");
	}
	
}
