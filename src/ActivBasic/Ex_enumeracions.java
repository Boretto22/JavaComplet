package ActivBasic;

public class Ex_enumeracions {

    static enum Sexe {HOME, DONA};
    static enum EstatCivil {SOLTER, CASAT, DIVORCIAT};

    public static void main(String[] args){
        Sexe a = Sexe.HOME;
        Sexe b = Sexe.DONA;
        EstatCivil c = EstatCivil.SOLTER;
        EstatCivil d = EstatCivil.CASAT;
        EstatCivil e = EstatCivil.DIVORCIAT;

        System.out.println(a +","+ b +","+ c +","+ d +","+ e);
    }
}
