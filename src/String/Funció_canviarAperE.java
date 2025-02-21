package String;

public class Funció_canviarAperE {

    // Mètode principal per provar la funció
    public static void main(String[] args) {
        String text = "Albercoc" +
                "";

        System.out.println("Text original: " + text);
        System.out.println("Text modificat: " + replaceAWithE(text));
    }

    // Funció que substitueix les As per Es en un String
    public static String replaceAWithE(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Retorna el mateix String si és nul o buit
        }

        // Substitueix les lletres A/a per E/e
        return input.replace('A', 'E').replace('a', 'e');
    }
}
