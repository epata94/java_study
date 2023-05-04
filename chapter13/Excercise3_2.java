package chapter13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Excercise3_2 {

	public static void main(String[] args) {

		MemberEx2 me1 = new MemberEx2("hong", "홍길동", 30);
		MemberEx2 me2 = new MemberEx2("lee", "이순신", 40);
		MemberEx2 me3 = new MemberEx2("kim", "김유신", 50);

		List memberList = new ArrayList();
		memberList.add(me1);
		memberList.add(me2);
		memberList.add(me3);

		Iterator<MemberEx2> iterator = memberList.iterator();
		// 전체 회원 출력
		while (iterator.hasNext()){
			MemberEx2 me = iterator.next();
			System.out.println(me.getId()+","+me.getName()+","+me.getAge());
		}

	}

}

class MemberEx2 {

	String id;
	String name;
	int age;

	MemberEx2(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}