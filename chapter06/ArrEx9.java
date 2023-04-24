package chapter06;

public class ArrEx9 {

	public static void sum(int num1, int num2){
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}

	public static void main(String[] args) {
		int[] iValue={1,2}; //
		System.out.println(iValue[0]);
		System.out.println(iValue[1]);
		sum(1, 2);
//		System.out.println(iValue[2]);
// iValue[2] 이 구문에서 아래와 같은 런타임에러 발생
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
		System.out.println("첫번째 값 : "+args[0]);
		System.out.println("두번째 값 : "+args[1]);

	}

}
