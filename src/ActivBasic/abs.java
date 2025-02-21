package ActivBasic;

import java.util.Scanner;

public class abs {
    public static void main(String[] args) {

        Scanner floatput = new Scanner(System.in);
        System.out.println("Enter N: ");
        float f = floatput.nextInt();
        float af = absolut(f);

    }

    public static float absolut(float n){

        if(n>=0){
            return n;
        }
        else {
            return -n;
        }
    }
}
