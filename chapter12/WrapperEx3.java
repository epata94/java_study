package chapter12;

public class WrapperEx3 {

	public static void main(String[] args) {
		
		String number = "100";
		
		int i1 = Integer.parseInt(number);
		// intValue() 메소드는 JDK 9 버전이후에 삭제될 예정이였으나 하위호환을 위해 남겨둔 메소드
		// 그래서 사용하지 않는 것을 권장
		int i2 = new Integer(number).intValue();
		int i3 = Integer.valueOf(number);
		
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		System.out.println("i3 = "+i3);

	}

}
