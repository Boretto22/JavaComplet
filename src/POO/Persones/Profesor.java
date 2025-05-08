package POO.Persones;

public class Profesor extends Persona{

    int anysDocent;
    String dept;

    //Construsctors

    public Profesor(String nom, int edat, SEXE sexe, int anysDocent, String dept) {
        super(nom, edat, sexe);
        this.anysDocent = anysDocent;
        this.dept = dept;
    }

    //Setters

    public void setAnysDocent(int anysDocent) {
        this.anysDocent = anysDocent;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    //Getters

    public int getAnysDocent() {
        return anysDocent;
    }

    public String getDept() {
        return dept;
    }

    public void print(){
        System.out.printf("%s és professor desde fa %d i és del dept. de %s.%n",nom,anysDocent,dept);
    }
}
