package Funcions;

public class Funció3_IVA {
    public static void main(String[] args) {
        float preu0 = 150;
        float preu1 = afegirIVA(preu0);
        System.out.printf("El preu amb IVA és %f. ", preu1);
    }

    public static float afegirIVA(float preu){
        return preu*1.21f;
    }
}
