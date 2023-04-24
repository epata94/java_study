package chapter05;

public class Gugu2 {

	public static void main(String[] args) {
//		for(int i=1;i <=9; i++) {
//			System.out.println("2 * "+i+" = "+2*i);
//		}
		for (int j=2; j<10; j++) {
			System.out.println("["+j+"단]");
			for (int i=1; i<10; i++) {
				System.out.println(j + " * " + i + " = " + j*i);
			}
		}
		System.out.println("프로그램 종료");
	}
}
