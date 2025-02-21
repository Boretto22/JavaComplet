package ActivBasic;

import java.util.Scanner;

public class ConversióTemp_C_F {

    public static void main(String[] args) {
        Scanner floatput = new Scanner(System.in);
        System.out.print("Enter Graus ºC: ");
        float c = floatput.nextFloat();

        float F = (c * 9 / 5f) + 32;

        System.out.println("La temp. en ºF és: " + F);
    }

}
