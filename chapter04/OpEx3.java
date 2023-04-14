package chapter04;

public class OpEx3 {

	public static void main(String[] args) {

//		int a = 10;
//		int b = 10;
//
//		++a; // 전위연산
//		b++; // 후위연산
//
//		System.out.println(a);
//		System.out.println(b);

//		int a = 10;
		// a++ => a=a+1 (다음 라인에서 값 증가)
		// ++a => a=a+1 (현재 라인에서 값 증가하도록 처리)
//		int b = ++a; // 전위연산은 현재 라인에서 변수 값을 증가
//
//		System.out.println("전위연산 결과 : "+b);
//
//		int x = 10;
//		int y = x++; // 후위연산은 다음 라인에서 변수 값을 증가
		// y의 값이 x의 증가된 값이 대입되었다고 판단한다면
		// 컴파일 에러는 발생하지 않지만 y의 값을 잘못이해하고 사용할
		// 가능성이 존재한다.
//		System.out.println("후위연산 결과 : "+y);
//		System.out.println("x : "+x);

		int a = 10;
		a++;
		System.out.println("a++ : " + a);
		int b = 10;
		b += 1;
		System.out.println("b += 1 : " + b);
		int c = 10;
		c = c + 1;
		System.out.println("c = c + 1 : " + c);
		int d = 10;
		System.out.println(d++);


	}

}
