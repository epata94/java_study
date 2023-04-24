package chapter05;

public class P91_2 {
    public static void main(String[] args) {
        int orderQuantity=10;      // 주문수량
        int inventoryQuantity=15;  // 재고수량
       // 중첩된 if 사이에 처리해야 할 로직이 있는 경우
        if(orderQuantity>0){
            System.out.println("주문수량이"+orderQuantity+"로 확인되었습니다.");
            // 기타 두번째 조건 체크전에 처리해야할 로직이 있다면
            // 여기에 구현해야 한다.
            if(orderQuantity<inventoryQuantity) {
                inventoryQuantity -= orderQuantity;
                System.out.println("주문이 완료되었습니다.");
            }
        }
    }
}
