package chapter13;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Locale;

public class HashSetEx3 {
    public static void main(String[] args) {
        String[] websiteData =  {
                "초코파이", "다이제", "칸쵸", "틴캔커피", "진라면",
                "스크류바", "삼각김밥", "포카칩", "칠성사이다", "파워에이드",
                "콜라", "솔의눈", "핫식스", "허니버터칩", "불닭볶음면",
                "새우깡", "쌈장", "홈런볼", "미닛메이드", "크랜베리쥬스",
                "홍삼정", "종가집튀김", "초코빙수", "에이스초밥", "참이슬",
                "진주소주", "블루베리요거트", "양파링", "오레오쿠키", "몽쉘",
                "미쯔쯔", "더블초코파이", "소떡소떡", "빅파이", "콘치즈",
                "숯불바베큐꼬치", "누룽지탕", "스팸클래식", "돼지불고기김밥", "김구이",
                "크리미마스카포네", "수플레팬케이크", "프링글스", "몬스터에너지", "포도쥬스",
                "소불고기", "포카리스웨트", "초코송이", "고래밥", "청정원칼국수",
                "페레로로쉐", "꼬깔콘", "해태누네띠네", "카페라떼", "양조간장",
                "신라면", "바나나우유", "빅스윙치킨", "사무엘팥빙수", "아이시스",
                "눈을감자", "카라멜마끼아또", "감자깡", "백화점브랜드", "초코송이",
                "베베크크림", "모카프라푸치노", "동물크래커", "크리미언", "카놀라오일",
                "크런키스", "초코우유", "우유치즈","양파링","종가집튀김", "초코빙수", "에이스초밥", "참이슬",
                "진주소주", "블루베리요거트", "양파링", "오레오쿠키", "몽쉘",
                "미쯔쯔", "더블초코파이", "소떡소떡", "빅파이", "콘치즈",
                "숯불바베큐꼬치", "누룽지탕", "스팸클래식", "돼지불고기김밥", "김구이",
                "크리미마스카포네", "수플레팬케이크", "프링글스", "몬스터에너지", "포도쥬스",
                "소불고기", "포카리스웨트", "초코송이", "초코파이", "다이제", "칸쵸", "틴캔커피", "진라면",
                "스크류바", "삼각김밥", "포카칩", "칠성사이다", "파워에이드",
                "콜라", "솔의눈", "핫식스", "허니버터칩", "불닭볶음면",
                "새우깡", "쌈장", "홈런볼", "미닛메이드", "크랜베리쥬스",
                "홍삼정", "종가집튀김", "초코빙수", "에이스초밥", "참이슬",
                "진주소주", "블루베리요거트", "양파링", "오레오쿠키", "몽쉘",
                "미쯔쯔", "더블초코파이", "소떡소떡", "빅파이", "콘치즈",
                "숯불바베큐꼬치", "누룽지탕", "스팸클래식", "돼지불고기김밥", "김구이",
                "크리미마스카포네", "수플레팬케이크", "프링글스", "몬스터에너지", "포도쥬스",
                "소불고기", "포카리스웨트", "초코송이", "고래밥", "청정원칼국수",
                "페레로로쉐", "꼬깔콘", "해태누네띠네", "카페라떼", "양조간장",
                "신라면", "바나나우유", "빅스윙치킨", "사무엘팥빙수", "아이시스",
                "눈을감자", "카라멜마끼아또", "감자깡", "백화점브랜드", "초코송이",
                "베베크크림", "모카프라푸치노", "동물크래커", "크리미언", "카놀라오일",
                "크런키스", "초코우유", "우유치즈","양파링","종가집튀김", "초코빙수", "에이스초밥", "참이슬",
                "진주소주", "블루베리요거트", "양파링", "오레오쿠키", "몽쉘",
                "미쯔쯔", "더블초코파이", "소떡소떡", "빅파이", "콘치즈",
                "숯불바베큐꼬치", "누룽지탕", "스팸클래식", "돼지불고기김밥", "김구이",
                "크리미마스카포네", "수플레팬케이크", "프링글스", "몬스터에너지", "포도쥬스",
                "소불고기"};
                HashSet uniqueDataTypes = new HashSet();

        for (String data : websiteData) {
            uniqueDataTypes.add(data);
        }

        LocalDateTime now = LocalDateTime.now();

        // DateTimeFormatter 생성
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 EEEE h:mm a", Locale.KOREA);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 EEEE a h시간대", Locale.KOREA);

        // 포맷 적용하여 문자열로 변환
        String salesTime = now.format(formatter);
        System.out.println("* HK편의점 판매 제품 정보 ("+salesTime+" 기준)");
        System.out.println("- 총 데이터 개수: " + websiteData.length);
        System.out.println("- 종류별 데이터 개수: " + uniqueDataTypes.size());
        System.out.println("- 종류별 데이터 ");
        int count=1;
        for(Object product:uniqueDataTypes){
            System.out.print(" "+(String)product);
            count++;
            if (count==15){
                System.out.println("");
                count=1;
            }
        }
    }
}
