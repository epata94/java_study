package chapter05;

public class P91_1 {
    public static void main(String[] args) {
        int orderQuantity=10;      // 주문수량
        int inventoryQuantity=15;  // 재고수량
       // 분기복잡도는 낮은 예제
        if((orderQuantity>0) && (orderQuantity <= inventoryQuantity) ){
            // inventoryQuantity = inventoryQuantity - orderQuantity;
            inventoryQuantity -= orderQuantity;
            System.out.println("주문이 완료되었습니다.");
        }
    }
}
