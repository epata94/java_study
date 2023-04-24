package chapter05;

public class ForEx2 {

	public static final int MAX = 10;

	public static void main(String[] args) {

		// 총합을 구하는 문제를 풀기위해서는
		// 총합 변수를 선언하고 초기값을 0으로 한다.
		int sum = 0;
		
		for (int i = 1; i<= MAX; i++) {
			sum += i; // 반복문을 돌면서 더해야 하는 변수의 값을 누적시킨다.
			// sum = sum+i;
		}
		
		System.out.println("합계 : "+sum);

	}

}
