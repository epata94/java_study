package Test;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Test!");
		String a = "Hello";
		int num=1;
		boolean b = true;
		a = a + num;
		System.out.println(a);
		a=a+b;
		System.out.println(a);
		
		
		float f=3.14f;
		a = a+f;
		System.out.println(a);
		
		int acquiredScore=0;
		final int passStandard = 90;
		
		acquiredScore=90;
				
		if (acquiredScore > passStandard)
			System.out.println("Pass");
		

		
	}

}
