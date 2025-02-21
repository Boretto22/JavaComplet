
package ActivBasic;

import java.util.Scanner;

public class Divisió {

    public static void main(String[] arg) {

        Scanner floatput = new Scanner(System.in);
        System.out.print("Enter Num 1: ");
        float Num1 = floatput.nextInt();

        System.out.print("Enter Num 2: ");
        float Num2 = floatput.nextInt();

        float divisió = Num1 / Num2;

        System.out.println("Sa resposta és: ");
        System.out.println(divisió);

    }

}