package Funcions_Recursives;

public class Recursives1 {

    public static void main(String[] args) {
        countDown(10);

    }
     public static void countDown(int n){

        if (n==0){
            System.out.println("Boom!");
        }
        else{
            System.out.println(n);
            countDown(n-1);
        }
    }
}
