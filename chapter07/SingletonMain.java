package chapter07;

public class SingletonMain {

	public static void main(String[] args) {
		//Singleton s = new Singleton(); // 에러 발생
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		if (s1 == s2)
			System.out.println("s1 == s2");
		
	}

}
