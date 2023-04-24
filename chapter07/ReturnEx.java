package chapter07;

public class ReturnEx {
	
	public static void main(String[] args) {
		
		Return obj = new Return();
		
		String name = obj.getName();
		int age = obj.getAge();
		
		System.out.println(name);
		System.out.println(age);
		// 함수의 매개변수를 다른 함수의 리턴값으로 사용한 케이스
		// A(B()); => A([B함수의 리턴값])
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}
}

class Return {
	String getName() {
		return "홍길동";
	}
	
	int getAge() {
		return 30;
	}
}