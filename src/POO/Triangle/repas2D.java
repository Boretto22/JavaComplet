package POO.Triangle;

import processing.core.PApplet;

public class repas2D {

    //Atributs, propietats o variables de clase
    float x,y;
    String nom;

    //Construstor(s)
    repas2D(){
        this.x = 0; this.y = 0; this.nom = "0";
    }

    repas2D(String nom, float x, float y){
        this.nom = nom;
        this.x = x;
        this.y = y;
    }

    //Setters (Mutadores)
    void setX(float x){this.x = x;}
    void setY(float y){this.y = y;}
    void setNom(String nom){this.nom = nom;}
    void setXY(float x, float y){this.x = x; this.y = y;}

    //Getters  (Accesores)
    String getNom(){return this.nom;}
    float getX(){return this.x;}
    float getY(){return this.y;}

    //Altres
    void display(PApplet p5){
        p5.circle(this.x, this.y,30);
        p5.fill(0);
        p5.text(nom, this.x+30,this.y);
    }
}
