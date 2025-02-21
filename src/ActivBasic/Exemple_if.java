package ActivBasic;

public class Exemple_if {
    public static void main(String[] args){

        int velocitat = 100;
        if(velocitat<=90) {
            System.out.println("Velocitat adequada."); //fins aquí sense else
        }else{
            System.out.println("Velocitat excessiva."); //amb else
        }
    }
}
