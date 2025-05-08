package POO.Triangle;

import processing.core.PApplet;

public class Triangle {

    repas2D a,b,c;

    Triangle(repas2D p1, repas2D p2, repas2D p3){
        this.a = p1; this.b = p2; this.c = p3;
    }

    Triangle(float x1, float y1, float x2, float y2, float x3, float y3){
        this.a = new repas2D("A",x1, y1);
        this.b = new repas2D("B",x2, y2);
        this.c = new repas2D("C",x3, y3);
    }

    // Setters

    public void setA(repas2D a) {
        this.a = a;
    }

    public void setB(repas2D b) {
        this.b = b;
    }

    public void setC(repas2D c) {
        this.c = c;
    }


    // Getters

    public repas2D getA() {
        return a;
    }

    public repas2D getB() {
        return b;
    }

    public repas2D getC() {
        return c;
    }


    // Altres

    public void display(PApplet p5, int tColor){

        p5.stroke(0); p5.strokeWeight(2);
        p5.fill(tColor);

        // Dibuixa triangle
        p5.beginShape();
        p5.vertex(a.x, a.y);
        p5.vertex(b.x, b.y);
        p5.vertex(c.x, c.y);
        p5.endShape(p5.CLOSE);

        // Dibuixa punts
        p5.fill(0);
        a.display(p5);
        b.display(p5);
        c.display(p5);
    }
}
