package chapter14.wildcard;

// Person 상속 Man 클래스
class Man extends Person {
    // 생성자
    Man(String name) {
        this.name = name;
    }

    // name 반환 메소드
    public String toString() {
        return name.toString();
    }
}
