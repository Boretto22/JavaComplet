package POO.Poligon;

import POO.Punt2D;
import processing.core.PApplet;

public class Estrella12 extends Poligon{

    float radiInterior;

    Estrella12(Punt2D c, float radiInterior,float radiExterior){
        super(12,c,radiExterior);
        updatePuntsInteriors(c);
        this.radiInterior = radiInterior;
    }

    public void setRadiInterior(float r){this.radiInterior = r;}

    public void updatePuntsInteriors(Punt2D c){
        float angStep = 360f / 12;
        float ang = 0;
        for(int i = 0; i< punts.length; i += 2){
            punts[i].x = c.getX() + radiInterior* PApplet.cos(PApplet.radians(ang));
            punts[i].y = c.getY() + radiInterior* PApplet.sin(PApplet.radians(ang));
            ang += 2*angStep;
        }
    }
}
