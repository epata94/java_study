package chapter05;

public class IfEx3 {

	public static void main(String[] args) {
		
		int math = 90;
		int eng = 95;
// 아래 코드는 하나의 "통과" 상태를 처리 하기 위해서 두번의 분기를 거쳤다.
// 복잡도가 높다고 볼수 있다.
// 이러한 복잡도를 Cyclomatic Complexity(회전, 분기 복잡도)
// 	아래예제의 복잡도는 계산식에 따라 2 또는 3으로 계산된다.
 		if( (math >= 60) && (eng >= 60)	){
//		if (math >= 60) {
//			if (eng >= 60) {
				System.out.println("통과");
//			}
		} else {
			System.out.println("탈락");
		}

	}

}
