package chapter14;

import java.util.*;

public class GBasic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		String name = list.get(0);
//		String name = (String)list.get(0);
		System.out.println(list.get(0).length());
		System.out.println(name);
		
//		list.add(1); // 런타임에러가 발생하기 전에 보다 컴파일 에러로 문제를 빨리 해결할 수 있다.
//		String name2 = (String)list.get(1); // 컴파일 에러가 발생하지 않는다. 하지만 런타임 에러가 발생한다. 
		
		System.out.println(((String)list.get(1)).length()); // 컴파일 에러가 발생하지 않는다. 하지만 런타임 에러가 발생한다.
		System.out.println(name);
	}

}
