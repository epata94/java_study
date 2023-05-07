package chapter14;
import java.util.HashMap;
import java.util.Map;
public class Q4 {
    public static void main(String[] args) {
        // Integer 타입의 key와 Employee 타입의 value를 가지는 HashMap 생성
        Map<Integer, Employee3> employees = new HashMap<>();

        // Employee 객체 생성
        Employee3 alice = new Employee3(1, "홍길동");
        Employee3 bob = new Employee3(2, "이순신");
        Employee3 charlie = new Employee3(3, "강감찬");

        // Employee 객체를 HashMap에 추가
        employees.put(alice.getId(), alice);
        employees.put(bob.getId(), bob);
        employees.put(charlie.getId(), charlie);

        // Employee 객체의 id를 입력받아 해당 Employee 객체의 이름을 출력
        int id = 2;
        Employee3 employee = employees.get(id);
        System.out.println("id가 " + id + "인 Employee의 이름은 " + employee.getName() + "입니다.");
    }

}

class Employee3 {
    private int id;
    private String name;

    public Employee3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}