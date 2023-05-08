package chapter15;

public class LambdaFunctionEx {

	public static void main(String[] args) {
						 // 람다식, 람다함수
						// 람다함수는 메소드를 구현할 인터페이스가 필요함
					    // 람다함수는 인터페이스의 추상메소드를 람다식으로 정의
		InterfaceEx ie = (int x, int y) -> x+y;
		
		System.out.println(ie.sum(1, 2));

	}

}

interface InterfaceEx {
	public int sum(int x, int y);
}