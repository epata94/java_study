package chapter13;

import java.util.Vector;
// ArrayList, Vector 클래스 모두 동일한 자료구조, 메소드를 가지고 있다.
// 단, 성능상 Vector 클래스는 Multi Thread 환경에서 좋은 성능을 보인다.
// 그 이외에 대부분의 경우에 ArrayList로 구현한다.
public class ListEx2 {

	public static void main(String[] args) {
		
		Vector list = new Vector();
		list.add(1.2); // List 메서드
		list.add(Math.PI); // List 메서드
		list.addElement(3.4); // 이전 메서드
		
		// 향상된 for문
		for (Object o : list) {
			System.out.println(o);
		}
		double num = 3.4;
		
		// 해당 요소의 인덱스 (없으면 -1)
		int index = list.indexOf(num);
		if (index >= 0) { // 요소가 존재함
			System.out.println(num + " 의 위치 :" + index);
		} else { // 존재하지 않음
			System.out.println(num + " 는 list 에 없습니다");
		}
		
		num = 1.2;
		// 값이 존재하는지 확인
		if (list.contains(num)) {
			// 제거(이전 메서드)
			list.removeElement(num);
			System.out.println(num + " 삭제됨");
		}
		
		// 해당 요소의 인덱스 (없으면 -1)
		System.out.println(list.indexOf(num));
		System.out.println(list); // toString()

	}

}
