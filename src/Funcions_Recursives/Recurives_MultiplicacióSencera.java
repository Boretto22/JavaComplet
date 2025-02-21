package Funcions_Recursives;

public class Recurives_MultiplicacióSencera {
    public static void main(String[] args) {
      System.out.print(multiplicacio(6, 55));
    }

        public static int multiplicacio(int a,int b){

        if (b==0){
            return 0;
        }
        else{
            return multiplicacio(a, b-1)+a;
        }
    }
}
