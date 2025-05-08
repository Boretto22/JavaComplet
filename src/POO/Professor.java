package POO;

public class Professor {

    enum DEPARTAMENT {FÍSICA, MATES, CATALÀ, ANGLÈS}

    //Atributs o propietats
    String nom;
    int anys;
    DEPARTAMENT departament;

    //Mètodes

    //Constructor(s)
    Professor(String n, int a,DEPARTAMENT d){
        nom = n;
        anys = a;
        departament = d;
    }

    Professor(String n,DEPARTAMENT d){
        nom = n;
        anys = 0;
        departament = d;
    }

    //Seters
    void setNom(String n){nom = n;}
    void setAnys(int a){anys = a;}
    void setDepartament(DEPARTAMENT d){departament = d;}

    //Getters
    String getNom(){return nom;}
    int getAnys(){return anys;}
    DEPARTAMENT getDepartament(){return departament;}

    //Altres
    void print(){
        System.out.printf("%s, %s (%d).\n", nom, departament, anys);
    }
}
