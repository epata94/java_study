package chapter05;

import java.util.Scanner;

public class ParkMission5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=0;
		String grade="";
		int fee=0;
		int	money=0;
		int paymentType=1;
		int remainedFreeTicket=3;
		int remainedDiscountTicket=5;
		int payedCustomerCounter=0;
				
		while (true) {
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
					
			if (fee!=0) {
				payedCustomerCounter+=1;
				if (paymentType == 1) {
					System.out.print("요금을 입력하세요: ");
					money = scan.nextInt();
				
					if (money == fee) {
						System.out.println("감사합니다. 티켓을 발행합니다.");
					}else if (money < fee) {
						System.out.println((fee-money)+"원이 모자랍니다. 입력 하신 "+money+"원을 반환합니다.");
					}else {
						System.out.println("감사합니다. 티켓을 발행하고 거스름돈 "+(money-fee)+"원을 반환합니다.");
					}
				}else {
					money =(int)(fee * 0.9);
					if (age >=60 && age<=65) {	
						money *= 0.95;
					}
					System.out.println(money+"원 결제되었습니다. 티켓을 발행합니다.");
				}
				
				if ( (payedCustomerCounter % 7 == 0) && (remainedFreeTicket > 0)) {
					remainedFreeTicket -= 1;
					System.out.println("\n축하합니다. 1주년 이벤트에 당첨되었습니다. 여기 무료 티켓을 발행합니다. (현재 잔여 무료티켓 "+remainedFreeTicket+"장)");
				}else if ( (payedCustomerCounter % 4 == 0) && (remainedDiscountTicket > 0)) {
					remainedDiscountTicket -= 1;
					System.out.println("\n축하합니다. 연간회원권 구매 이벤트에 당첨되셨습니다. 연간 회원 할인 티켓을 발행합니다. (현재 잔여 할인티켓 "+remainedDiscountTicket+"장)");
				}
				
			}else {
				System.out.println("감사합니다. 티켓을 발행합니다.");
			}
			System.out.println();
		}
		
	}

}
