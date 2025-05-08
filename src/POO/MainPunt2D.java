package POO;

public class MainPunt2D {
    public static void main(String[] args) {
         //Declaració
        Punt2D p1, p2;

        //Instanciació
        p1 = new Punt2D("X",100,200);
        p2 = new Punt2D(50,100);

        //Setter
        p2.setNom("Y");

        //Altres
        double d = p1.dist(p2);
        System.out.printf("La dist. entre p1 i p2 és de %f.\n",d);

        p1.print();
        p2.print();
    }
}
