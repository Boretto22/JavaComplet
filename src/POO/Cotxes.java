package POO;

public class Cotxes {

    //Atributs o propietats
    String marca;
    String matricula;
    float velocitat;
    int portes;

    //Mètodes

    //Contructor(s)
    Cotxes(String mr, String mt, float v, int p){
        marca = mr;
        matricula =mt;
        velocitat = v;
        portes = p;
    }
    Cotxes(String mr){
        marca = mr;
        matricula = "1234A";
        velocitat = 100;
        portes = 4;
    }

    //Setters (mutadores)
    void setMarca(String mr){marca = mr;}
    void setMatricula(String mt){matricula = mt;}
    void setVelocitat(float v){velocitat = v;}
    void setPortes(int p){portes = p;}
    void setMatriculaVelocitatPortes(String mt, float v,int p){matricula = mt; velocitat = v; portes = p;}

    //Getters (accesores)
    String getMarca(){return marca;}
    String getMatricula(){return matricula;}
    float getVelocitat(){return velocitat;}
    int getPortes(){return portes;}

    //Altres
    void print(){
        System.out.printf("%s, %s, %f, %d.\n", marca,matricula,velocitat,portes);
    }

    void accelerar(float q){
        velocitat += q;
    }
    
}
