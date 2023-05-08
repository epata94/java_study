package chapter15;

public class LambdaEx3 {

	public static void main(String[] args) {
		
//		LambdaInterface3 li3 = (String name) -> {
//			System.out.println("제 이름은 "+name+"입니다.");
//		};
		
//		LambdaInterface3 li3 = (name) -> {
//			System.out.println("제 이름은 "+name+"입니다.");
//		};

		// 람다함수안에 실행문이 한 줄일 경우에 {} 생략할 수 있다.
//		LambdaInterface3 li3 = name -> {
//			System.out.println("제 이름은 "+name+"입니다.");
//		};
		
		LambdaInterface3 li3 = name -> System.out.println("제 이름은 "+name+"입니다.");
		
		li3.print("홍길동");

	}

}

@FunctionalInterface
interface LambdaInterface3 {
	void print(String name);
//	void print2(String name);
}