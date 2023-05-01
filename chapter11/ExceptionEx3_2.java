package chapter11;

public class ExceptionEx3_2 {
    public static void main(String[] args) {
        try{
            int[] arr ={1,2,3};
//            System.out.println(arr[3]);
            System.out.println(arr[2]);
            System.out.println(3/0);
//            System.out.println(3/1);
            Integer.parseInt("a");
        }catch (Exception e){
            System.out.println("예외 발생: "+e);
        }
    }

}
