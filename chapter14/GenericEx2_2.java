package chapter14;

public class GenericEx2_2 {

	public static void main(String[] args) {
		
		Generic3<String> gen = new Generic3<String>();
		String[] ss = {"홍길동","이순신","김유신"};
		
		// String 제네릭 타입의 매개변수에 String 배열객체 전달
		gen.set(ss);
		gen.print();
		
		for(String s : gen.get()) {
			//String s = (String)o; // 형변환 필요없음
			System.out.println(s);
		}
		
		Integer[] ii = {1,2,3};
		
		// String 제네릭 타입의 매개변수에 Integer 배열객체 전달
		// nogen.set(ii); // 에러 발생
		Generic3<Integer> gen2 = new Generic3<Integer>();
		gen2.set(ii);
		gen2.print();
		
		for(Integer o : gen2.get()) {
			// String s = (String)o; // 형변환 필요없음
			System.out.println(o);
		}

	}

}

class Generic3<S> {
	S[] v;
	
	void set(S[] n) {
		v = n;
	}
	
	S[] get() {
		return v;
	}
	
	void print() {
		for(S o : v) {
			System.out.print(o + " ");
		}
		System.out.println();
	}
}