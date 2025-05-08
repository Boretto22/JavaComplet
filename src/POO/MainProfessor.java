package POO;

public class MainProfessor {
    public static void main(String[] args) {
        //Declaració
        Professor p1,p2,p3;

        //Cridades als constructors
        p1 = new Professor("Higgin", 62, Professor.DEPARTAMENT.FÍSICA);
        p2 = new Professor("Xesca", 240, Professor.DEPARTAMENT.CATALÀ);
        p3 = new Professor("Tommy", Professor.DEPARTAMENT.MATES);

        //Setters
        p1.setDepartament(Professor.DEPARTAMENT.ANGLÈS);
        p2.setNom("Bruixa");
        p3.setAnys(15);

        //Getters
        int sumaAnys = p1.getAnys() + p2.getAnys() + p3.getAnys();
        System.out.printf("SUMA ANYS: %d.\n", sumaAnys);

        //Altres
        p1.print();
        p2.print();
        p3.print();


    }
}
