package chapter04;

public class Excercise5 {
// 윤년 조건
//	4의 배수인 경우 윤년이지만 100의 배수인 경우 윤년이 아니다.
//	400의 배수인 경우 윤년이다.
	public static void main(String[] args) {
		
		int year = 2020;
		
		boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		// 윤년이면 true, 윤년이 아니면 false
		System.out.println(leapYear);
		
		
	}
}
