package chapter07_additional;

public class Method4 {
	// 명령문(Statement) 7라인
	public static void sayHello(String name) {
		System.out.println(name+"님 안녕하세요.");
		System.out.println("교실에 입장하셨습니다.");
		System.out.println("출석체크하세요.");
		System.out.println("오늘도 화이팅입니다.\n");
	}

	public static void main(String[] args) {
		
		String[] studentNameList= {"James","Bruno","Evan","George","Henry"};
		
		for (String name : studentNameList)
			sayHello(name);
	}	


}
