package chapter04;

public class Excercise3_2 {

	public static void main(String[] args) {
		
		int penNumber_for_das=1;
		int limit = 2;
		int studentCount = 27;
		
		while(true) {
			if ( (penNumber_for_das * 5) /studentCount >= limit)
				break;
			penNumber_for_das += 1;
		}
		
		int colorPen = 5 * penNumber_for_das;
		
		
		
		int divColorPen = colorPen / studentCount; 
		
		System.out.println("한 다스에 있는 색연필수 : "+penNumber_for_das);
		
		System.out.println("학생당 나눠가지는 색연필수 :"+divColorPen);
		
		int remainColorPen = colorPen % studentCount;
		System.out.println("똑같이 나눠가지고 남은 볼펜수 : "+remainColorPen);
		
		
//		int colorPen = 5 * ___[1]___;
//		int studentCount = 27;
//		
//		
//		int divColorPen = ___[2]___; 
//		System.out.println("학생당 나눠가지는 색연필수 :"+divColorPen);
//		
//		int remainColorPen = ___[3]___;
//		System.out.println("똑같이 나눠가지고 남은 볼펜수 : "+remainColorPen);
	}
}
