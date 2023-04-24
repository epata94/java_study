package chapter05;

public class DoWhileEx {

	public static void main(String[] args) {
		
		int i = 10;
		
		do {
			// do-while은 while 대비
			// do-while 블록안에 있는 로직이 최소한 1번 이상 수행되는 것을
			// 보장한다.
			// 최소한 1번 이상 수행이 필요한 로직 예) 초기화, 메뉴출력
			System.out.println("i = "+i);
		}while (i < 10);
		
	}

}
