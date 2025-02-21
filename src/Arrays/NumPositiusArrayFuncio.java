package Arrays;

public class NumPositiusArrayFuncio {

    public static void main(String[] args){

        int[] numeros = {7, -6, 21, 7, -3, 0, 1};
        System.out.printf("L'array té %d números positius.", numPositiusArray(numeros));

    }

    public static int numPositiusArray(int[] a){
        int n = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]>0){
                n++;
            }
        }
        return n;
    }


}
