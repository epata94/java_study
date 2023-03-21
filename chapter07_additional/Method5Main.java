package chapter07_additional;

public class Method5Main {
	// 명령문(Statement) 3라인

	public static void main(String[] args) {
		
		String[] studentNameList= {"James","Bruno","Evan","George","Henry"};
		
		for (String name : studentNameList)
			Method5.sayHello(name);
	}	


}
