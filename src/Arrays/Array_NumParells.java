package Arrays;

public class Array_NumParells {
    public static void main(String[] args){

        int[] numeros = {5,7,5,9,6,2,4,5,7};
        System.out.printf("L\'array té %d números parells.", numParellsArray(numeros));

    }

    public static int numParellsArray(int[] a){
        int n = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                n++;
            }
        }
        return n;
    }

}
