package POO.Persones;

public class Alumne extends Persona{
    int curs;
    char grup;

    //Constructors
    public Alumne(String nom, int edat, SEXE sexe, int curs, char grup) {
        super(nom, edat, sexe);
        this.curs = curs;
        this.grup = grup;
    }

    //Setters

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public void setGrup(char grup) {
        this.grup = grup;
    }

    //Getters

    public int getCurs() {
        return curs;
    }

    public char getGrup() {
        return grup;
    }

    @Override
    public void print(){
        System.out.printf("%s va a %d - %c.%n", nom, curs, grup);
    }
}
