package chapter12;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		// 동일한 seed값으로 랜덤하게 생성되는 값을 재현할수 있다.
		// Random은 데이터를 임의로 발생시켜서 특정 상황에 대한 시뮬레이션을 할 때 주로 사용
		// 시뮬레이션 할 때 동일한 시나리오로 재현할 경우가 많이 있다. 이럴 경우에 랜덤하게 발생한 시나리오를
		// 재현하는 목적으로 seed값을 동일하게 설정한다.
		Random r1 = new Random(42);
		Random r2 = new Random(41);
		
		System.out.println("r1");
		for (int i=0; i<5; i++) {
			System.out.println(i + "=" + r1.nextInt());
		}
		/**
		 * 화면 출력: int 범위 내에서 Random한 값을 생성
		 * r1
		 * 0=-1170105035
		 * 1=234785527
		 * 2=-1360544799
		 * 3=205897768
		 * 4=1325939940
		 */
		System.out.println("r2");
		for (int i=0; i<5; i++) {
			System.out.println(i + "=" + r2.nextInt());
		}
		/**
		 * 화면출력
		 * r2
		 * 0=-1170105035
		 * 1=234785527
		 * 2=-1360544799
		 * 3=205897768
		 * 4=1325939940
		 */

	}

}
