package chapter13;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
//		Iterator i = new Iterator<E>() {
//		};
		Object o = 1;
		Integer i = 1;
		int[] array = {1,2,3};
		int[] array2 = {1,2,3};
		
		
		System.out.println(array.equals(array2));
		System.out.println(array.getClass());
		System.out.println();
		System.out.println();

	}

}
