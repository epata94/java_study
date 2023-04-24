package chapter07;
class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printInfo() {
        System.out.println("이름: " + name + ", 나이: " + age + ", 주소: " + address);
    }
}

public class GetterSetterExample {
    public static void main(String[] args) {
        Person person1 = new Person("홍길동", 30, "서울시 강남구");
        Person person2 = new Person("김철수", 25, "서울시 강북구");

        System.out.println("person1 정보 출력");
        person1.printInfo();

        System.out.println("\nperson2 정보 출력");
        person2.printInfo();

        person1.setAddress("서울시 서초구");
        System.out.println("\nperson1 주소 변경 후 정보 출력");
        person1.printInfo();
    }
}
