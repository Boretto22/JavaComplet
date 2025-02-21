package ActivBasic;

import java.util.Scanner;

public class ConversióTemp {

    public static void main(String[] args){
        Scanner floatput = new Scanner(System.in);
        System.out.print("Enter Graus ºF: ");
        float f = floatput.nextFloat();

        float C = (5/9f) * (f - 32);

        System.out.println("La temp. en ºC és:" +C);





    }


}
