package chapter14;
import java.util.ArrayList;
public class Q2 {
    public static void main(String[] args) {
        // Employee 타입을 저장할 ArrayList 생성
        ArrayList<Employee1> employees = new ArrayList<>();

        // Employee 객체 추가
        employees.add(new Employee1("홍길동", 25, 50000));
        employees.add(new Employee1("이순신", 30, 60000));
        employees.add(new Employee1("강감찬", 35, 70000));

        // 정렬된 Employee 객체 출력
        for (Employee1 employee : employees) {
            System.out.println(employee);
        }
    }
}
class Employee1 {
    private String name;
    private int age;
    private int salary;

    public Employee1(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public String toString() {
        return "이름: " + name + ", 나이: " + age + ", 급여: " + salary;
    }
}