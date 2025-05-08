package POO;

import processing.core.PApplet;

public class Punt2D {

    //Atributs o propietats
    String nom;
    public float x,y;

    //Constructor(s)
    public Punt2D(String n, float x, float y){
        this.nom = n;
        this.x = x;
        this.y = y;
    }
    public Punt2D(float x, float y){
        this.nom = "A";
        this.x = x;
        this.y = y;
    }
    public Punt2D(){
        this.nom = "O";
        this.x = 0;
        this.y = 0;
    }

    //Getters
    public String getNom(){return this.nom;}
    public float getX(){return this.x;}
    public float getY(){return this.y;}

    //Setters
    void setNom(String n){this.nom = n;}
    void setX(float x){this.x = x;}
    void setY(float y){this.y = y;}
    void setXY(float x, float y){this.x = x; this.y = y;}

    //Altres

    //funció que permeti saber la distància respecte 2 punts
    double dist(Punt2D altre){
        return Math.sqrt(Math.pow(this.x - altre.x, 2) + Math.pow(this.y - altre.y,2));
    }

    void print(){System.out.printf("punt %s: (%f, %f).\n", nom, x,y);}

    public void display(PApplet p5){
        p5.fill(0);
        p5.circle(this. x, this.y, 20);
        p5.textSize(18); p5.textAlign(p5.LEFT);
        p5.text(this.nom+"("+this.x+", "+this.y+")",this.x + 15, this.y);
    }


}
