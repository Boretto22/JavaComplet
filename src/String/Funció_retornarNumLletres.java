package String;

public class Funció_retornarNumLletres {
    public static int countLetterA(String input) {
        if (input == null) {
            return 0; // Retorna 0 si el String és nul
        }

        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == 'A' || c == 'a') {
                count++;
            }
        }
        return count;
    }

    // Mètode principal per provar la funció
    public static void main(String[] args) {
        String text = "Abanico";
        int numberOfAs = countLetterA(text);
        System.out.println("El nombre de lletres 'A' en el text és: " + numberOfAs);
    }
}
