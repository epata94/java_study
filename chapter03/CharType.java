package chapter03;

public class CharType {

	public static void main(String[] args) {
		// "[문자열]" 예) "Good Morning! Everyone!"
		// '[문자]'   예) 'G'
		char a = 'A';

// println함수에서 아래와 같이 사용할 수 있다.
// "[문자열]"+변수
// 변수가 문자로 변화되어서 앞에 문자열에 붙여넣어진다(concatenate).
		System.out.println("a:"+a);
		
		int b = a; // char 타입에서 int 타입으로 형변환
		System.out.println("b:"+b);
		
		char c = 66;
		System.out.println("c:"+c);
		
		int d = a+b; // 65 + 65
		System.out.println("d:"+d);

	}

}
