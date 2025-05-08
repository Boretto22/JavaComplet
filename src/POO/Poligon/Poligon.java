package POO.Poligon;

import POO.Punt2D;
import processing.core.PApplet;

public class Poligon {

    Punt2D[] punts; //Composició



    Poligon(int n){
        punts = new Punt2D[n];
    }

    Poligon(int n, Punt2D c, float r){
        this(n); //Cridada a l'altre constructor de Poligon
        float angStep = 360f / n;
        float ang = 0;
        for(int i=0; i<punts.length;i++){
            float x = c.getX() + r* PApplet.cos(PApplet.radians(ang));
            float y = c.getY() + r* PApplet.sin(PApplet.radians(ang));
            String t = String.valueOf(i+1);
            setPuntAt(i, new Punt2D(t,x,y));
            ang += angStep;
        }
    }

    //Setter
    public void setPuntAt(int i,Punt2D p) {
        punts[i] = p;
    }

    //Getter
    Punt2D getPuntAt(int i){
        return punts[i];
    }

    public void display(PApplet p5){
        p5.stroke(0);
        p5.fill(200,100,100,50);

        p5.beginShape();
        for(int i = 0; i< punts.length; i++){
            p5.vertex(punts[i].getX(), punts[i].getY());
        }
        p5.endShape(p5.CLOSE);

        for(int i = 0; i< punts.length; i++){
            punts[i].display(p5);
        }
    }
}
