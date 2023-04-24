package chapter05;

public class ForEx {


	// 상수는 가능한 자바에서 정의한 상수형태로 활용하는 것이 유지보수에 좋다.
	public static final int MAX = 3;

	public static void main(String[] args) {

		for (int i = 0; i< MAX; i++) {
			System.out.println("i = "+i);
		}

	}

}
