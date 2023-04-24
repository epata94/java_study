package chapter07;

public class MyPersonMain {
    public static void main(String[] args) {
        MyPerson person = new MyPerson("John", 25);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        person.setName("Jane");
        person.setAge(30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
