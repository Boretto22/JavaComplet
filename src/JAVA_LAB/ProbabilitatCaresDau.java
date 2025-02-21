package JAVA_LAB;

public class ProbabilitatCaresDau {
    public static void main(String[] args) {
        // Nombre d'experiments per cada cas
        int[] experiments = {100, 1000, 1000000};

        // Creem un array bidimensional per emmagatzemar les probabilitats
        float[][] probabilitats = new float[experiments.length][6];

        // Per cada experiment (100, 1000, 1000000)
        for (int i = 0; i < experiments.length; i++) {
            int numTirades = experiments[i];
            int[] ocurrencies = new int[6]; // Array per comptar les ocurrències de cada cara

            // Simulació de les tirades del dau
            for (int j = 0; j < numTirades; j++) {
                int caraAleatoria = 1 + (int) (Math.random() * 6); // Tirada aleatòria entre 1 i 6
                ocurrencies[caraAleatoria - 1]++; // Comptem la cara corresponent
            }

            // Calculem la probabilitat de cada cara
            for (int k = 0; k < 6; k++) {
                probabilitats[i][k] = (float) ocurrencies[k] / numTirades;
            }
        }

        // Imprimim els resultats
        for (int i = 0; i < experiments.length; i++) {
            System.out.println("\nExperiment amb " + experiments[i] + " tirades:");
            for (int j = 0; j < 6; j++) {
                System.out.printf("%d\t%.6f\n", j + 1, probabilitats[i][j]);
            }
        }
    }
}
