package ActivBasic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner longput = new Scanner(System.in);
        System.out.print("Enter Num: ");
        long f=longput.nextLong();

        System.out.printf("Valor factorial de %d és %d", f, fact(f));

    }

    public static long fact(long n){
        long f=1;
        while (n>1){
            f=f+n;
            n=n-1;
        }
        return f;
    }
}
