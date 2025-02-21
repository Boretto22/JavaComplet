package String;

public class Funció_StringCapicua {


    // Mètode principal per provar la funció
    public static void main(String[] args) {
        String text = "melovolem";

        System.out.println("El text \"" + text + "\" és capicua? " + isPalindrome(text));
    }

    // Funció que comprova si un String és capicua
    public static boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false; // Retorna fals si el String és nul o buit
        }

        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                return false; // No és capicua si els caràcters no coincideixen
            }
        }
        return true; // És capicua si tots els caràcters coincideixen
    }
}

