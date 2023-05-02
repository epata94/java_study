package chapter12;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		for (int i=0; i<15; i++) {
//nextInt(경계값) : 0이상 경계값미만의 랜덤한 값을 생성
			System.out.println(rand.nextInt(6)+1);
		}

	}

}
