import java.util.Scanner;

public class TresEnLinia {

    public enum VALOR {BUIDA, CERCLE, CREU};
    public static VALOR[][] tauler;

    public enum RESULTAT {ENJOC, EMPAT,GUANYADOR_A, GUANYADOR_B};
    public static RESULTAT resultat;

    public enum TORN {JUGADOR_A, JUGADOR_B};
    public static TORN torn;
    public static int numTirades;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        inicialitzaPartida();
        mostrarTauler(tauler);
        while(!partidaAcabada()){
            ferTirada(input,torn,tauler);
            mostrarTauler(tauler);
            resultat = comprovaResultat(tauler);
            torn = canviaTorn(torn);
        }

        mostrarResultat(resultat);
    }

    public static void inicialitzaPartida(){
        numTirades = 0;
        tauler = new VALOR[3][3];
        for (int i=0; i< tauler.length; i++){
            for (int j=0; j<tauler[i].length; j++){
                tauler[i][j]= VALOR.BUIDA;
            }
        }
        torn = TORN.JUGADOR_A;
        resultat = RESULTAT.ENJOC;
    }

    public static void mostrarTauler(VALOR[][] t){
        for (int i=0; i< tauler.length; i++){
            for (int j=0; j<tauler[i].length; j++){
                System.out.print("|");
                switch (t[i][j]){
                    case BUIDA : System.out.print(" "); break;
                    case CREU : System.out.print("X"); break;
                    case CERCLE : System.out.print("O"); break;

                }
            }
            System.out.println("|");
        }
    }

    public static boolean partidaAcabada(){
        return resultat !=RESULTAT.ENJOC;
    }

    public static int demanar(String s, Scanner input){
        System.out.print(s);
        return input.nextInt();
    }

    public static void ferTirada(Scanner input, TORN t, VALOR[][] tauler){

        System.out.println("Partida: "+ resultat);
        System.out.println("Torn: "+torn);
        int fila, col;
        do {
            fila = demanar("Fila: ", input);
            col= demanar("Columna: ", input);

        }while (! tiradaValida(fila, col, tauler));

            tauler[fila][col] = (t == TORN.JUGADOR_A) ? VALOR.CREU : VALOR.CERCLE;
            numTirades++;
    }

    public static boolean tiradaValida(int f, int c, VALOR[][] t){
        return (f>=0 && f<=2 && c>=0 && t[f][c]==VALOR.BUIDA);
    }

    public static TORN canviaTorn(TORN t) {
        if (t == TORN.JUGADOR_A) {
            return TORN.JUGADOR_B;
        }
        else {
            return TORN.JUGADOR_A;
        }

    }

    public static RESULTAT comprovaResultat(VALOR[][] t){
        boolean guanya = false;

        for(int f=0; f<=2; f++){
            if(t[f][0]==t[f][1] && t[f][1]==t[f][2] && t[f][0]!=VALOR.BUIDA){
                guanya = true;
                break;
            }
        }
        for(int c=0; c<=2; c++){
            if(t[0][c]==t[1][c] && t[1][c]==t[2][c] && t[0][c]!=VALOR.BUIDA){
                guanya = true;
                break;
            }
        }

        if(t[2][0]==t[1][1] && t[1][1]==t[0][2] && t[1][1]!=VALOR.BUIDA){
            guanya = true;
        }
        if(t[0][0]==t[1][1] && t[1][1]==t[2][2] && t[1][1]!=VALOR.BUIDA){
            guanya = true;
        }

        if(guanya && torn==TORN.JUGADOR_A){
            return RESULTAT.GUANYADOR_A;
        } else if (guanya && torn==TORN.JUGADOR_B) {
            return RESULTAT.GUANYADOR_B;
        } else if (!guanya && numTirades==9){
            return RESULTAT.EMPAT;
        } else {
            return RESULTAT.ENJOC;
        }
    }

    public static void mostrarResultat(RESULTAT r){
        if(r==RESULTAT.EMPAT){
            System.out.println("EMPAT,sou la peste");
        }
        else if(r==RESULTAT.GUANYADOR_A){
            System.out.println("GUANYA EL JUGADOR A. B pringao");
        }
        else if(r==RESULTAT.GUANYADOR_B){
            System.out.println("Guanya B. Ho has fet bé A");
        }
        else{
            System.out.println("La partida continuaaa...");
        }
    }

}
