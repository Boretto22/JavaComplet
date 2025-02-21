import java.util.Scanner;

public class Binari2Hexa {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Num Binari: ");
        long NumBinari = input.nextLong();
        long NumBinarioriginal = NumBinari;


        String sh = "";

        while(NumBinari!=0){


            int r = (int)(NumBinari % 10000);


            String dh = NumAHexaString(Binari2Deci(r));


            sh = dh + sh;


            NumBinari = NumBinari / 10000;
        }


        System.out.printf("El num biniar %d en hexa és: %s", NumBinarioriginal, sh);
    }


    public static int Binari2Deci(int nb){
        int nd = 0;
        int pot = 1;

        while(nb!=0){
            int r = nb % 10;
            nb = nb / 10;
            nd = r*pot + nd;
            pot = 2 * pot;
        }
        return nd;
    }


    public static String NumAHexaString(int n){
        if(n<10){
            return String.valueOf(n);
        }
        else if(n==10){
            return "A";
        }
        else if(n==11){
            return "B";
        }
        else if(n==12){
            return "C";
        }
        else if(n==13){
            return "D";
        }
        else if(n==14){
            return "E";
        }
        else {
            return "F";
        }
    }
}

