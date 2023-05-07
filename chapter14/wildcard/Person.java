package chapter14.wildcard;

public class Person {
    String name;

    // 기본 생성자
    Person() {
    }

    // 생성자 오버로딩
    Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}