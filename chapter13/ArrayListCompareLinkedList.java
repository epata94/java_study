package chapter13;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListCompareLinkedList {

	public static void main(String[] args) {

		ArrayList alist = new ArrayList();
		LinkedList llist = new LinkedList();
		
		for (int i=0; i<100000; i++) {
			alist.add(i);
			llist.add(i);
		}
		
		System.out.println("ArrayList Access");
		// 각각의 성능을 측정하기 위해서 start, end 시간을 저장한다.
		long start = System.currentTimeMillis();
		// ArrayList 읽기 작업
		for (int i=0; i<alist.size(); i++) {
			alist.get(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		System.out.println("LinkedList Access");
		start = System.currentTimeMillis();
		for (int i=0; i<llist.size(); i++) {
			llist.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println(end-start);

	}

}
