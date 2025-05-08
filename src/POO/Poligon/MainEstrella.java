package POO.Poligon;

import POO.Punt2D;
import processing.core.PApplet;

public class MainEstrella extends PApplet {

        Estrella12 e; //Declaració
        Punt2D ce;

        public static void main(String[] args) {
            PApplet.main("POO.Poligon.MainEstrella");
        }

        public void settings(){size(1000,1000);}

        public void setup(){
            ce  = new Punt2D("0", 0,0);
            e = new Estrella12(new Punt2D("0",0,0),150, 300);

        }

        public void draw(){
            background(255);
            translate(width/2,height/2);
            line(-width,0,width,0);
            line(0,height,0,-height);
            e.display(this);

            float rInt = map(mouseX, 0, width, 0, 500);
            e.setRadiInterior(rInt);
            e.updatePuntsInteriors(ce);
        }
    }
