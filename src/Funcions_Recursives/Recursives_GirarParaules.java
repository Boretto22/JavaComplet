package Funcions_Recursives;

public class Recursives_GirarParaules {

    public static void main(String[] args) {
        String s="Murciegalo";
        System.out.printf("%s girat és %s", s, gira(s));
    }

    public static String gira(String s){
        if(s.length()==1){ return s;}else{return gira(s.substring(1)) + s.charAt(0);}
    }
}
