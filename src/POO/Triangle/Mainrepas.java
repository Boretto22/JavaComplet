package POO.Triangle;

import processing.core.PApplet;

public class Mainrepas extends PApplet {

    repas2D p1,p2,p3;

    public static void main(String[] args) {
        PApplet.main("POO.Triangle.Mainrepas");
    }

    public void settings(){
        size(800,800);

    }

    public void setup(){
        p1 = new repas2D();
        p2 = new repas2D("A", 200, 200);
        p3 = new repas2D("B", -200, 100);
    }

    public void draw(){
        background(255);
        translate(width/2, height/2);
        fill(0);
        p1.display(this);
        p2.display(this);
        p3.display(this);
    }
}
