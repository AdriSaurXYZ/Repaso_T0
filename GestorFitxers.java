import java.io.*;

public class GestorFitxers {

    public static void llegir(String nomFitxer) {
        try {
            // Abrimos el fichero para leer su contenido
            FileReader fr = new FileReader(nomFitxer);
            BufferedReader br = new BufferedReader(fr);

            String linia;
            System.out.println("Contenido del fichero:");
            while ((linia = br.readLine()) != null) {
                System.out.println(linia);
            }

            br.close();
            fr.close();
        } catch (IOException e) {
            System.err.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    public static void escriure(String nomFitxer, String text) {
        try {
            // Abrimos el fichero en modo de escritura (o edición)
            FileWriter fw = new FileWriter(nomFitxer, true);
            BufferedWriter bw = new BufferedWriter(fw);

            // Añadimso texto nuevo al fichero
            bw.write(text);
            bw.newLine();

            bw.close();
            fw.close();

            System.out.println("Texto añadido al fichero con exito!");
        } catch (IOException e) {
            System.err.println("Error al editar al fichero: " + e.getMessage());
        }
    }
}