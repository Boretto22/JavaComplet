package Arrays;

public class Array_Invertit {

    public static void main(String[] args) {

        int[] a = {5,7,5,9,6,2,1,4};
        ArrayPro.printArray(Revertirarray(a));
    }

    public static int[] Revertirarray(int[] a){
        int[] invertit = new int[a.length];
        for (int i=0; i< a.length;i++){
            invertit [i] = a[a.length-i-1];
        }
        return invertit;
    }
}
