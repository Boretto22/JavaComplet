package Funcions_Recursives;

public class Recursives_ParImpar {

    public static void main(String[] args) {
         System.out.print(par(44));
    }

    public static boolean par(int p){
        if (p==0){ return true;} else {return impar(p-1);}
    }

    public static boolean impar(int p){
        if (p==0){
            return false;
        }
        else {
            return par(p-1);
        }
    }

}
