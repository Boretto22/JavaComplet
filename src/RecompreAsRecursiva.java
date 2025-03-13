public class RecompreAsRecursiva {

    public static void main(String[] args) {
        String text = "malaida";
        System.out.println("Nombre de 'A's en \"" + text + "\": " + contarAs(text));
    }

    public static int contarAs(String P) {
        if (P.length() == 1) {
            if (P.charAt(0) == 'a') {
                return 1;
            } else {
                return 0;
            }
        } else {

            String P1 = P.substring(0, P.length() / 2);
            String P2 = P.substring(P.length() / 2);

            return contarAs(P1) + contarAs(P2);
        }
    }
}
