package POO.Persones;

public class MainPersones {

    public static void main(String[] args) {
        Alumne a1,a2;
        Profesor p1;
        Jugador j1;
        p1 = new Profesor("Manel", 51, Persona.SEXE.HOME, 23, "Física");
        a1 = new Alumne("Pere", 15, Persona.SEXE.HOME,1,'A');
        a2 = new Alumne("Maria", 16, Persona.SEXE.DONA, 2, 'B');
        j1 = new Jugador("Messi", 37, Persona.SEXE.HOME, "Inter Miami", Jugador.POSICIO.DAVANTER);

        a1.print();
        a2.print();
        p1.print();
        j1.print();
    }
}
