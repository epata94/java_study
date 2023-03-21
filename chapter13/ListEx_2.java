package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ListEx_2 {
	
	public static void showListStatus(List list) {
		for(int i=0;i<list. size();i++) {
			System.out.println(i+":"+ list.get(i));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(1);list.add(2);
		list.add(3);list.add(4);
		list.add(5);list.add(6);
		System.out.println(list);

		showListStatus(list);
		list.remove(0);
		
		showListStatus(list);
		
		list.remove(4);
		showListStatus(list);
	
	}

}
