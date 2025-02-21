package Funcions_Recursives;

public class Recursives_OrdenarArray {
    public static void main(String[] args) {
        int [] nums={7,8,5,4,3,9,4,1,7};
        sort(nums, 0);
        printArray(nums);
    }

    public static int posMin(int[] array, int start){
        int valorMin=array[start];
        int posicioMin=start;
        for(int i=start+1; i<array.length; i++){
           if (array[i]<valorMin){
               valorMin=array[i];
               posicioMin = i;
           }
        }
        return posicioMin;
    }

    public static void printArray(int[] array){
        for(int i=0; i< array.length; i++){
            System.out.printf("%d : %d\n", i, array[i]);
        }
    }

    public static void sort(int[] array, int start){
        if(start<array.length-1){
            int pMin = posMin(array, start);
            int temp=array[start];
            array[start] = array[pMin];
            array[pMin]= temp;
            sort(array,start+1);
        }
    }
}