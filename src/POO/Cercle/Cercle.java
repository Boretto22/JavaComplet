package POO.Cercle;

import POO.Punt2D;
import processing.core.PApplet;

public class Cercle {

    Punt2D centre;
    float radi;

    //Constructor
    public Cercle(Punt2D centre, float radi) {
        this.centre = centre;
        this.radi = radi;
    }

    public Cercle() {
        this.centre = new Punt2D("C", 0 , 0);
        this.radi = 100;
    }

    //Getters
    public float getRadi() {
        return radi;
    }

    public Punt2D getCentre() {
        return centre;
    }

    //Setters

    public void setCentre(Punt2D centre) {
        this.centre = centre;
    }

    public void setRadi(float radi) {
        this.radi = radi;
    }

    public void display(PApplet p5){
        p5.fill(200,100,50,50);
        p5.circle(this.centre.getX(),this.centre.getY(),2*this.radi);
        this.centre.display(p5);
    }
}
