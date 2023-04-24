package chapter05;

public class P96_2 {
    public static void main(String[] args) {
        int iValue=5;
        int level=0;

        switch (iValue){
            case 1:
            case 2:
                level=1;
                break;
            case 3:
            case 4:
                level=2;
                break;
            case 5:
            case 6:
                level=3;
                break;
        }
    }
}
