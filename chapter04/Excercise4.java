package chapter04;

public class Excercise4 {
// 요구사항에서 변수를 추출시 팁
// 문장에서 값을 표현하는 명사 => 변수, 상수 대상
// 범위를 표현
// A가 B를 초과할 경우, A가 B보다 큰 경우: A>B
// A가 B 미만일 경우, A가 B보다 작은 경우: A<B
// A가 B 이상일 경우, A가 B보다 같거나 큰경우: A>=B
// A가 B 이하일 경우, A가 B보다 작거나 같은 경우: A<=B
	public static void main(String[] args) {
		
		int age = 6;
		int height = 130;
		boolean parent = false;
		boolean heartDease = true;
		
		boolean take = ((age >= 6 && height >= 120) || (height >= 120 && parent == true)) && heartDease == false;
		boolean take2 = ((heartDease == false) && ((age >= 6 && height >= 120) || (height >= 120 && parent == true))) ;

		System.out.println(take);
	}
}

