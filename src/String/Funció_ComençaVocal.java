package String;

public class Funció_ComençaVocal {
    // Mètode principal per provar la funció
    public static void main(String[] args) {
        String text1 = "Elefant";
        String text2 = "Tigre";
        String text3 = "Anaconda";
        String text4 = "Serp";

        System.out.println("El text \"" + text1 + "\" comença per vocal? " + startsWithVowel(text1));
        System.out.println("El text \"" + text2 + "\" comença per vocal? " + startsWithVowel(text2));
        System.out.println("El text \"" + text3 + "\" comença per vocal? " + startsWithVowel(text3));
        System.out.println("El text \"" + text4 + "\" comença per vocal? " + startsWithVowel(text4));
    }

    // Funció que comprova si un String comença amb una vocal
    public static boolean startsWithVowel(String input) {
        if (input == null || input.isEmpty()) {
            return false; // Retorna fals si el String és nul o buit
        }

        // Obtenim la primera lletra del String i la convertim a minúscula
        char firstChar = Character.toLowerCase(input.charAt(0));

        // Comprovem si és una vocal
        return firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u';
    }
}
