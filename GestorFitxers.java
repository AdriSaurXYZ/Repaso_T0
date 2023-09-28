import java.io.*;

public class GestorFitxers {

    public static void llegir(String nomFitxer) {
        try {
            // Obrim el fitxer per a lectura
            FileReader fr = new FileReader(nomFitxer);
            BufferedReader br = new BufferedReader(fr);

            String linia;
            System.out.println("Contingut del fitxer:");
            while ((linia = br.readLine()) != null) {
                System.out.println(linia);
            }

            br.close();
            fr.close();
        } catch (IOException e) {
            System.err.println("Error en llegir el fitxer: " + e.getMessage());
        }
    }

    public static void escriure(String nomFitxer, String text) {
        try {
            // Obrim el fitxer per a escriptura en mode d'adjuntar (append)
            FileWriter fw = new FileWriter(nomFitxer, true);
            BufferedWriter bw = new BufferedWriter(fw);

            // Escrivim el text al fitxer
            bw.write(text);
            bw.newLine(); // Afegim una nova línia

            bw.close();
            fw.close();

            System.out.println("Text afegit al fitxer amb èxit.");
        } catch (IOException e) {
            System.err.println("Error en escriure al fitxer: " + e.getMessage());
        }
    }
}