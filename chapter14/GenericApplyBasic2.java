package chapter14;

import java.util.ArrayList;

public class GenericApplyBasic2 {
    public static void main(String[] args) {
//        ArrayList<String> studnentList = new ArrayList<String>();
        ArrayList<String> studnentList = new ArrayList<>();
        studnentList.add("김채연");
        studnentList.add("이하은");
        studnentList.add("최선남");
//        studnentList.add(1); // 잘못된 타입이 들어와도 사전에 미리 알수 있다.
//
        for(int i=0;i<studnentList.size();i++){
            // 제네릭을 사용하면 특별히 형변환 하지 않아도 된다.
            String name = studnentList.get(i);
            System.out.println("이름 : "+ name);
        }
        for(String name: studnentList){
            System.out.println("이름: "+name);
        }
    }
}
