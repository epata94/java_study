package chapter11;

public class ExceptionEx2 {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		} catch(ArithmeticException e) {
			System.out.println(5); // 예외가 발생하지 않으면 catch문은 실행이 되지 않는다.
		}
		System.out.println(6);
	}
	
}
