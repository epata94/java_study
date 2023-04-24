package chapter05;

public class WhileEx {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		while (i <= 100) {
			sum += i;
			i++;
		}
	// while 반복문안에서 Break Point를 걸고 반복문 바깥으로 빠져나오고 싶을때
	// while 바깥쪽 명령어에 커서를 바꾸고 단축키 Alt+F9 또는 Ctrl+Alt+F9으로
	// 이동한다. 이것이 안 될경우 메뉴에서 선택하여 이동한다.
		System.out.println("합계 : "+sum);

	}

}
