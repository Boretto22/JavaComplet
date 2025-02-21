package Arrays;

public class Array_Zippeat {
    public static void main(String[] args) {
        int[] a= {5,15,25,35};
        int[] b= {10,20,30};

        ArrayPro.printArray(zipArrays(a,b));
    }

    public static int[] zipArrays(int[] a, int[] b){
        int[] c= new int[a.length + b.length];
        for  (int i=0; i< a.length; i++){
            c[2*i]=a[i];
        }
        for (int i=0; i< b.length; i++){
            c[2*i+1]=b[i];
        }
        return c;
    }
}
