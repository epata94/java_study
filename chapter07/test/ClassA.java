package chapter07.test;

public class ClassA {
	
	public static void main(String[] args) {
	
		ClassB cb = new ClassB();
		cb.print();
		
	}
	
	public void print() {
		System.out.println("여기는 ClassA");
	}
	
}

// public class ClassB { : 하나의 java 파일에는 하나의 public 클래스가 유효
class ClassB {
	void print() {
		System.out.println("여기는 ClassB");
	}
}