package Matrius;

public class Array_2dimensions {
    public static void main(String[] args) {

        char[][] array = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
        };

        //Recorregut per files

        for (int f = 0; f < array.length; f++) {
            for (int c = 0; c < array[f].length; c++) {
                System.out.printf("%c\t", array[f][c]);
            }
            System.out.printf("\n");
        }

        //Recorregut per columnes
        for (int c = 0; c < array[0].length; c++) {
            for (int f = 0; f < array.length; f++) {
                System.out.printf("%c\t", array[f][c]);
            }
            System.out.printf("\n");
        }

        //Recorregut diagonal
        for (int f = 0; f < array.length; f++) {
            System.out.printf("%c\t", array[f][f]);
        }

        //Recorregut diagonal ascendent
        for (int f = 2, c = 0; f >= 0 && c < array.length; f--, c++) {
            System.out.printf("%c\t", array[f][c]);
        }
    }

    public static void imprimir(int[][] array){
        for(int i=0; i< array.length; i++){
            for(int j=0; j< array[i].length; j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
