package Matrius;

public class Matrius_Iguals {
    public static void main(String[] args) {
        int[][] matriuA = {{2, 4, 5}, {1, 5, 8}};
        int[][] matriuB = {{2, 4, 5}, {1, 5, 7}};

        System.out.printf("Les matrius són iguals? %b", matriusIguals(matriuA, matriuB));
    }
    public static boolean matriusIguals(int[][] m1, int[][] m2){
        for (int i=0; i< m1.length; i++){
            for (int j=0; j<m1[i].length; j++){
                if (m1[i][j]!=m2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
