package chapter05;

import java.util.Scanner;

public class ParkMission2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int age=0;
		String grade="";
		int fee=0;
		
		System.out.print("나이를 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		
		age = scan.nextInt();
		

		if (age<0) {						
			System.out.println("다시 입력하세요.");
			System.exit(0);
		}else if (age<=3) {
			grade="유아";
		}else if (age>3 && age<=13) {
			grade="어린이";
			fee=2000;
		}else if (age>=14 && age<=18) {
			grade="청소년";
			fee=3000;
		}else if (age>=19 && age<=65) {
			grade="성인";
			fee=5000;
		}else {
			grade="노인";
		}

		System.out.print("귀하는 \'"+grade+"\' 등급이며 ");
		if (fee==0)		System.out.println("요금은 무료입니다.");
		else			System.out.println("요금은 "+fee+"원 입니다.");
	}

}
