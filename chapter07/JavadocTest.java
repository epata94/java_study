package chapter07;

// 인텔리제이에서 생성자 단축키는 클래스명에서 alt+insert
public class JavadocTest {

	int myValue;
	String className;


	/**
	 * 두 배견수의 합 리턴
	 * @param a 첫번째 수
	 * @param b 두번째 수
	 * @return 두수의 합
	 */

	public int add(int a, int b) {
		return a+b;
	}
// 인텔리제이 javadoc 단축키는 함수 선언문 앞에서 '/**' 치고 엔터
	/**
	 * 두 수의 차
	 * @param a 첫번째 수
	 * @param b 두번째 수
	 * @return 두수의 차
	 */
	public int substract(int a, int b) {
		return a-b;
	}
}
