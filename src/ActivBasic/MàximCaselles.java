package ActivBasic;

public class MàximCaselles {

    public static void main(String[] args){

        int[] numeros = {6,5,8,1,9,8};
        int[] notes = {2,8,6};

        System.out.printf("El màxim de l'array números és %d.\n", maxArray(numeros));
        System.out.printf("El màxim de l'array notes és %d.", maxArray(notes));

    }

    public static int maxArray(int[] a){
        int max = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }

}
