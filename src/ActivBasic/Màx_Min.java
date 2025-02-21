package ActivBasic;

import java.util.Scanner;

public class Màx_Min {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= 5; i++) {
            System.out.print("Numero: ");
            int n = input.nextInt();
            if (n > max) { max = n; }
            if (n < min) { min = n; }
            }
        System.out.printf("El màxim i el mínim són repectivament %d i %d.",max,min);

        }
    }

