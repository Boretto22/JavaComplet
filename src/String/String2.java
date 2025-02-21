package String;

public class String2 {
    public static void main(String[] args) {
        String paragraf = "Hola que tal com va";

        int paraules = 0;
        while(paragraf.indexOf(' ')!=-1){
            int posBlanck = paragraf.indexOf(' ');
            String paraula = paragraf.substring(0, posBlanck);
            paragraf = paragraf.substring(posBlanck+1);
            System.out.println(paraula);
            paraules ++;
        }
        System.out.println(paragraf);
        System.out.printf("Te %d paraules", paraules+1);
    }
}
