package chapter06;

public class LottoPractice2 {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        int index=0;
        while(true){
            int number = (int)(Math.random()*45)+1;

            boolean isDuplicate = false;
            for (int i=0; i<index;i++){
                if (lotto[i] == number){
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate==false) {
                lotto[index] = number;
                index++;
            }

            if(index==6){
                break;
            }

        }

        for(int i=0;i<index;i++){
            System.out.println(lotto[i]);
        }
    }
}
