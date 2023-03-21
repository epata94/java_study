package chapter13;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(1);
		list.add(true);
		list.add(3.14);
		list.add("hello");
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(i+": "+ list.get(i));
		}

	}

}
