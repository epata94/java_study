package chapter14;

import java.util.ArrayList;

public class GenericApplyBasic1 {
    public static void main(String[] args) {
        ArrayList studnentList = new ArrayList();
// String 타입으로 등록하지만 내부에서 Object 타입으로 변환됨
// 컬렉션 프레임워크의 구현 클래스가 등록요소를 Object로 관리함
        studnentList.add("김채연");
        studnentList.add("이하은");
        studnentList.add("최선남");
        studnentList.add(1); // studentList배열의 목적은 학생 이름을 저장하기 위한 용도
                             // 이는 추후 Runtime Error의 원인이 될 수 있다.

        for(int i=0;i<studnentList.size();i++){
            // 가져올때는 원래의 타입으로 형변환해 줘야 한다.
            // 제네릭으로 설정하지 않아서 잘못된 타입의 요소가 있을 경우 문제는 런타임 상황에 발생된다.
            String name = (String)studnentList.get(i);
            System.out.println("이름 : "+ name);
        }
        for(Object student: studnentList){
            String name = (String)student;
            System.out.println("이름: "+name);
        }
    }
}
