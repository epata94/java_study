package chapter07;

public class MyPersonMain {
    public static void main(String[] args) {
        MyPerson person = new MyPerson("John", 25);
//   Ctrl+Shift+i: 함수의 정의부 내용을 현재화면에서 확인 가능 (아래 getName()에서 확인해 보세요)
// 중복되는 실행문을 함수화 하기 위한 단축키: Ctrl+Alt+m
        printPersonInformantion(person);

        person.setName("Jane");
        person.setAge(30);
        printPersonInformantion(person);
    }

    private static void printPersonInformantion(MyPerson person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
