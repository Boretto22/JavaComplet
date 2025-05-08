package POO;

public class MainCotxes {
    public static void main(String[] args) {
        Cotxes c1,c2,c3; //Declaració

        //Cridades a constructors
        c1 = new Cotxes("Toyota", "5423CBD", 187, 5);
        c2 = new Cotxes("Honda", "3487WFU", 210, 3);
        c3 = new Cotxes("McLaren");

        //Setters
        c1.setMarca("Subaru");
        c2.accelerar(50);
        c3.setMatriculaVelocitatPortes("MESS10",420,3);

        //Getters
        System.out.printf("El cotxe més ràpid és el %s, amb una velocitat de %f.\n", c3.getMarca(), c3.getVelocitat());

        //Altres
        c1.print();
        c2.print();
        c3.print();
    }
}
