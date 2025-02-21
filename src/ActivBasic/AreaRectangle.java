package ActivBasic;

import java.util.Scanner;

public class AreaRectangle {

    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Costat 1: ");
        int Costat1 = input.nextInt();

        System.out.print("Enter Costat 2: ");
        int Costat2 = input.nextInt();
        int area = Costat1 * Costat2;

        System.out.println(area);
    }


}
