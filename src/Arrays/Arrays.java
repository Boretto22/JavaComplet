package Arrays;

public class Arrays {

    public static void main(String[] args) {
        //Definició i creació
        String [] noms = {"Pep", "Manolo", "Llorenç", "Ando"};

        for (int i= noms.length -1; i>=0; i--){
            System.out.printf("%s.\n", noms[i]);
        }
    }
}