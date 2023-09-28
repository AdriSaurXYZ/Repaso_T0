import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaDatos{
    private static BufferedReader br;

    public static void InputReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String readString(String prompt) {
        try {
            System.out.print(prompt);
            return br.readLine();
        } catch (IOException e) {
            System.err.println("Error al leer la entrada de texto.");
            return null;
        }
    }

    public int readInt(String prompt) {
        try {
            System.out.print(prompt);
            return Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.err.println("Error al leer el número entero. Asegúrese de ingresar un valor válido.");
            return 0;
        }
    }

    public float readFloat(String prompt) {
        try {
            System.out.print(prompt);
            return Float.parseFloat(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.err.println("Error al leer el número decimal (float). Asegúrese de ingresar un valor válido.");
            return 0.0f;
        }
    }

    public double readDouble(String prompt) {
        try {
            System.out.print(prompt);
            return Double.parseDouble(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.err.println("Error al leer el número decimal (double). Asegúrese de ingresar un valor válido.");
            return 0.0;
        }
    }

    public void close() {
        try {
            br.close();
        } catch (IOException e) {
            System.err.println("Error al cerrar el lector de entrada.");
        }
    }
}