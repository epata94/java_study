package chapter05;

import java.util.Scanner;

public class ParkMission1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=0;
		int fee=0;
		
		System.out.print("나이를 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		
		age = scan.nextInt();
		
		
		if (age>=4 && age<=13) 			fee=2000; 
		else if (age>=14 && age<=18) 	fee=3000;
		else if (age>=19 && age<=65) 	fee=5000;

		if (fee==0)		System.out.println("요금은 무료입니다.");
		else			System.out.println("요금은 "+fee+"원 입니다.");

	}

}
