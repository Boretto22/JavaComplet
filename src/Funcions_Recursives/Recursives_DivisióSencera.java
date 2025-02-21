package Funcions_Recursives;

public class Recursives_DivisióSencera {
    public static void main(String[] args){
        System.out.printf("%d / %d és %d.", 55, 5, divisio(55, 5));
    }

    public static int divisio(int a, int b){
        if(a<b){
            return 0;
        }
        else {
            return 1 + divisio(a-b, b);
        }
    }
}
