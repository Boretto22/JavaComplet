package POO;

public class Alumnes {

    //Propietats o atributs
    String nom;
    int curs;
    char grup;

    //Mètodes


    //Constructor(s)
    Alumnes(String n, int c, char g){
        nom = n;
        curs = c;
        grup = g;
    }

    Alumnes(String n){
        nom = n;
        curs = 1;
        grup = 'A';
    }

    //Setters (mutadores)
    void setNom(String n){nom = n;}
    void setCurs(int c){curs = c;}
    void setGrup(char g){grup = g;}
    void setCursGrup(int c, char g){curs = c;grup = g;}

    //Getters (accesores)
    String getNom(){return nom;}
    int getCurs(){return curs;}
    char getGrup(){return grup;}

    //Altres
    void print(){
        System.out.printf("%s - %d%c.\n", nom, curs, grup);
    }
}
