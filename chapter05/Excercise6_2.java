package chapter05;

import java.util.Scanner;

public class Excercise6_2 {

	public static void main(String[] args) {
		
		int baseLineNum=0;
		Scanner sc=new Scanner(System.in);
		
		do{
			System.out.print("밑변(홀수)를 입력하세요 (0: 종료): ");
			baseLineNum=sc.nextInt();
			
			if (baseLineNum == 0) {
				break;
			}else if(baseLineNum % 2 == 0) {
				System.out.println("밑변은 홀수만 입력하세요.\n");
				continue;
			}
			
			baseLineNum/=2;		
			
			for(int i=0; i<baseLineNum+1; i++) {		
				for(int j=0; j<baseLineNum-i; j++) {
					System.out.print(" ");
				}
				for(int k=0; k<2*i+1; k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			System.out.println("");
		}while(true);
		
	}
}
