package chapter13;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
	// TreeSet 기본 정렬 방식이: 오름차순
	// 오름 차순: 작은값부터 큰값으로 표현 (1,2,3,5,9) (aaa, bbb, bbc, def, fff)
	// 내림 차순: 큰값에서 작은값으로 표현 (9,5,3,2,1) (fff, def, bbc, bbb, aaa)
		SortedSet set = new TreeSet();
		String from = "bat";
		String to = "d";
		
		// set객체에 추가
		set.add("ant");set.add("alias");
		set.add("batman");set.add("aha");
		set.add("cola");set.add("Cola");
		set.add("ddr");set.add("dance");
		set.add("dEEE");set.add("deee");
		set.add("ever"); set.add("giant");
		set.add("zoo");
		
		// 출력
		System.out.println(set);
		System.out.println("from:"+from+",to:"+to);
		// from~to 검색
		System.out.println(set.subSet(from, to));
		System.out.println("from:"+from+",to:"+to+"zzzz");
		// from~to+"zzzz" 검색
		System.out.println(set.subSet(from,to+"b"));
//		System.out.println(set.subSet(from,to+"zzzz"));

		// 내림차순 정렬
		// TreeSet에서 내림차순 정렬을 적용하고자 할 때
		// Comparator 인터페이스를 구현한 클래스에서 내림차순을 compare 메소드에 적용을 하고
		// 해당 클래스의 객체를 생성자에 지정하면 된다.
		set = new TreeSet(new Descend());
		set.add("ant");set.add("alias");
		set.add("batman");set.add("aha");
		set.add("cola");set.add("Cola");
		set.add("ddr");set.add("dance");
		set.add("dEEE");set.add("deee");
		set.add("ever"); set.add("giant");
		set.add("zoo");
		
		System.out.println(set);
		System.out.println("from:"+from+",to:"+to);
		
		// to~from (반대로 검색)
		System.out.println(set.subSet(to, from));

	}

}
