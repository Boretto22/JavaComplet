package Funcions;

import java.util.Scanner;

public class Funció2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = input.nextInt();
        System.out.print("Enter B: ");
        int b = input.nextInt();

        int r = sumanumeros(a, b);
        System.out.printf("La suma de %d i %d és: %d", a, b, r);
    }
    public static int sumanumeros(int a, int b){
        int s = a+b;
        return s;

    }
}
