package Funcions_Recursives;

public class Recursives_Potència {

    public static void main(String[] args) {
        System.out.print(potencia(2,6));
    }

    public static int potencia(int b,int e){

        if(e==0){
            return 1;
        }
        else{
            return b*potencia(b, e-1);
        }
    }
    //segona manera
    public static int potencia2(int b, int e) {
        if (e == 0) {
            return 1;
        } else if (e % 2 == 0) {
            return potencia2(b, e / 2) * potencia2(b, e / 2);
        } else {
            return b * potencia2(b, e / 2) * potencia2(b, e / 2);
        }
    }
}
