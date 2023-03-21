package chapter07;

public class SingletonMain2 {

	public static void main(String[] args) {
		//Singleton s = new Singleton(); 
		
		Singleton2 s1 = Singleton2.getInstance();
		Singleton2 s2 = Singleton2.getInstance();
		Singleton2 s3 = Singleton2.getInstance();
		
		if (s1 == s2) {
			System.out.println("s1 is equal s2");
		}

		s1.set_magic_number(10);
		
		System.out.println(s1.get_magic_number());
		System.out.println(s2.get_magic_number());
		

	}

}
