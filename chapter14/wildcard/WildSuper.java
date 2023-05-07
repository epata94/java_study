package chapter14.wildcard;

import java.util.*;

// Person 클래스


public class WildSuper {

    public static void main(String[] args) {

        // Person
        List<Person> listP = new ArrayList<Person>();
        listP.add(new Person("사람"));
        listP.add(new Person("인간"));
        printData(listP); // 사람 인간

        // Man
        List<Man> listM = new ArrayList<Man>();
        listM.add(new Man("하현우"));
        listM.add(new Man("박효신"));
        printData(listM); // 하현우 박효신

        // Woman
        List<Woman> listW = new ArrayList<Woman>();
        listW.add(new Woman("백예린"));
        listW.add(new Woman("박정현"));
//      printData(listW); → Man 클래스의 상위 클래스가 아니기 때문에 메소드 호출 불가

    }

    // Man 클래스와 그 상위 클래스로 생성된 인스턴스만 매개변수로 전달 가능
    public static void printData(List<? super Man> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

}
