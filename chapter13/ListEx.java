package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		
		List list = new ArrayList(); // 인터페이스로 객체를 선언한 경우
//		ArrayList list = new ArrayList(); // 구현 클래스로 객체를 선언한 경우
		list.add(1);list.add(2);
		list.add(3);list.add(4);
		list.add(5);list.add(6);
		System.out.println(list);
		
		for(int i=0;i<list. size();i++) {
			System.out.println(i+":"+ list.get(i));
		}

	}

}
