package POO.Persones;

public class Persona {

    enum SEXE {HOME, DONA, ALTRE}

    String nom;
    int edat;
    SEXE sexe;

    //Constructor
    public Persona(String nom, int edat, SEXE sexe) {
        this.nom = nom;
        this.edat = edat;
        this.sexe = sexe;
    }

    //Setter

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setSexe(SEXE sexe) {
        this.sexe = sexe;
    }

    //Getter

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public SEXE getSexe() {
        return sexe;
    }


    public void print(){
        System.out.printf("%s té %d anys i és %s.%n", nom, edat, sexe);
    }
}
