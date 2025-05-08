package POO.Poligon;

import POO.Punt2D;
import processing.core.PApplet;

public class Main extends PApplet {

    Poligon t; //Declaració

    public static void main(String[] args) {
        PApplet.main("POO.Poligon.Main");
    }

    public void settings(){size(800,800);}

    public void setup(){
        t = new Poligon(6, new Punt2D("0",0,0),200);

    }

    public void draw(){
        background(255);
        translate(width/2,height/2);
        line(-width,0,width,0);
        line(0,height,0,-height);
        t.display(this);
    }
}
