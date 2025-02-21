package ActivBasic;

import java.util.Scanner;

public class ConversióCaF_Funció {
    public static void main(String[] args) {
        Scanner floatput = new Scanner(System.in);
        System.out.print("Enter Graus ºC: ");
        float c = floatput.nextFloat();

        System.out.printf("són %f Fº", c);
    }
    public static float temp(float c){

        float f = (c * 9 / 5f) + 32;
        return f;
    }

}
