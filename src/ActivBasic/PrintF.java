package ActivBasic;

public class PrintF {
    public static void main(String[] args) {
        String nom = "Paco";
        int edat = 44;
        char grup = 'A';
        System.out.printf("Hello %n"); //salt de línia
        System.out.printf("Hi %s", "John"); // cadena
        System.out.printf("It is %b", true); // booleà
        System.out.printf("Letter %c", 'B'); // Caràcter
        System.out.printf("Num %d", 123); // Número sencer
        System.out.printf("Num %f", 12.75); // Número real
        System.out.printf("Nom %s amb edat %d i grup sanguini %c", nom, edat, grup); //Tot junt
    }
}
