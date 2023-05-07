package chapter14.wildcard;

// Person 상속 Woman 클래스
class Woman extends Person {
    Woman(String name) {
        this.name = name;
    }

    public String toString() {
        return name.toString();
    }
}
