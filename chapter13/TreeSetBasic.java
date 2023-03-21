package chapter13;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetBasic {
	

	public static void main(String[] args) {
		TreeSet set = new TreeSet();//TreeSet생성
		set.add(7); //값추가
		set.add(4);
		set.add(9);
		set.add(1);
		set.add(5);

		set.remove(1);
//		set.clear();
		System.out.println(set.size());
	
		System.out.println(set); //전체출력 [2,3,4]
		System.out.println(set.first());//최소값 출력
		System.out.println(set.last());//최대값 출력
		System.out.println(set.higher(3));//입력값보다 큰 데이터중 최소값 출력 없으면 null
		System.out.println(set.lower(3));//입력값보다 작은 데이터중 최대값 출력 없으면 null
		
		Iterator iter = set.iterator();	// Iterator 사용
		while(iter.hasNext()) {//값이 있으면 true 없으면 false
		    System.out.println(iter.next());
		}
	}

}
