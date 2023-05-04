package chapter13;

import java.util.Comparator;

public class Descend implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Comparable c1 = (Comparable)o1;
		Comparable c2 = (Comparable)o2;
		// String의 compareTo가 호출됨
		return c1.compareTo(c2) * (-1);
//		return c1.compareTo(c2) * (1);
	}

	/**
	 * compareTo는 Comparable 인터페이스에 있는 추상메소드이며
	 * 교재에 있는 예가 String 클래스의 값을 기반으로 정렬을 하고 있다.
	 * 따라서 String클래스에서 compareTo 메소드에서 오름차순 정렬 기준을 바꾸도록 재정의하고 있다.
	 *
	String str1 = "apple";
	String str2 = "banana";

	int result = str1.compareTo(str2);

	if (result < 0) {
		System.out.println("str1 is smaller than str2");
	} else if (result > 0) {
		System.out.println("str1 is larger than str2");
	} else {
		System.out.println("str1 is equal to str2");
	}
	위 코드에서 str1과 str2를 compareTo 메서드로 비교하고, 결과값을 result 변수에 저장합니다. result 변수의 값이 음수이면 str1이 str2보다 작은 것이고, 양수이면 str1이 str2보다 큰 것입니다. result 변수의 값이 0이면 str1과 str2가 같다는 것을 의미합니다.

	위 예제 코드를 실행하면, str1이 banana보다 사전순으로 앞서는 apple이므로 str1 is smaller than str2라는 출력이 나옵니다.
	*/





}
