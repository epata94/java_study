package chapter07_additional;

public class Student {
	String names[];
	
	Student(String[] names){
		this.names = names;
	}
	
	public void sayHello() {
		
		for (String name:names) {
			System.out.println(name+"님 안녕하세요.");
			System.out.println("교실에 입장하셨습니다.");
			System.out.println("출석체크하세요.");
			System.out.println("오늘도 화이팅입니다.\n");
		}
	}

}
