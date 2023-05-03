package chapter12;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {

		String[] arr = {"홍길동", "이순신", "강감찬", "김유신"};
		for (String n : arr) System.out.print(n + ",");
//		Arrays.fill: 배열의 모든 요소를 특정 값으로 초기화 하고자 할 때 유용
		Arrays.fill(arr, "임꺽정"); //
		System.out.println("");
		for (String n : arr) System.out.print(n + ",");
		System.out.println();
		Arrays.fill(arr, 1, 3, "X");
		for (String n : arr) System.out.print(n + ",");

	}

}
