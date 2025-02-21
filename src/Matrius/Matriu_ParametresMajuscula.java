package Matrius;

public class Matriu_ParametresMajuscula {
    public static void main(String[] args) {
        String t="hello";
        System.out.println(t);
        majuscula(t);
        System.out.println(t);

    }
    public static void majuscula(String s){
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println(s);
    }
}
