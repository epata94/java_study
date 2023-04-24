package chapter05;

public class BreakEx {

	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			if (i == 5) {
				break; // 반복문 수행중 break를 만나게 되면 반복문을 즉시 빠져나온다.
			}
			System.out.println(i);
		}
		
	}

}
