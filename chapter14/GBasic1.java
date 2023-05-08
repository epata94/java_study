package chapter14;

import java.util.*;

public class GBasic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("홍길동");
		list.add("임꺽정");
//		String name = list.get(0);
		String name = (String)list.get(0);
		System.out.println(((String)list.get(0)).length());
		System.out.println(name);
		
		list.add(1);
		String name2 = (String)list.get(2); // 컴파일 에러가 발생하지 않는다. 하지만 런타임 에러가 발생한다.
		
//		System.out.println(((String)list.get(1)).length()); // 컴파일 에러가 발생하지 않는다. 하지만 런타임 에러가 발생한다.
//		System.out.println(name);

	}

}
