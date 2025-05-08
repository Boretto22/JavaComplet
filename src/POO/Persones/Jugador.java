package POO.Persones;

import POO.Punt2D;

public class Jugador extends Persona {

    // Enumerat de les diferents posicions
    enum POSICIO {PORTER, DEFENSA, MIG, DAVANTER};

    // Atributs

    String nomEquip;
    int numGols;
    POSICIO posicio;

    // Constructors

    public Jugador(String nom, int edat, SEXE sexe, String nomEquip, int numGols, POSICIO posicio) {
        super(nom, edat, sexe);
        this.nomEquip = nomEquip;
        this.numGols = numGols;
        this.posicio = posicio;
    }

    public Jugador(String nom, int edat, SEXE sexe, String nomEquip, POSICIO posicio) {
        super(nom, edat, sexe);
        this.nomEquip = nomEquip;
        this.numGols = 858;
        this.posicio = posicio;
    }

    // Getters

    public String getNomEquip() {
        return nomEquip;
    }

    public int getNumGols() {
        return numGols;
    }

    public POSICIO getPosicio() {
        return posicio;
    }

    // Setters

    public void setNomEquip(String nomEquip) {
        this.nomEquip = nomEquip;
    }

    public void setNumGols(int numGols) {
        this.numGols = numGols;
    }

    public void setPosicio(POSICIO posicio) {
        this.posicio = posicio;
    }

    // Altres

    public void print() {
        System.out.printf("El jugador/a %s té %d anys i és %s.%nEl seu equip és %s, ha fet %d gols i juga de %s.%n%n", nom, edat, sexe, nomEquip, numGols, posicio);
    }
}
