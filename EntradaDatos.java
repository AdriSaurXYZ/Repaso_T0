import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaDatos{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Leer un string
            System.out.print("Introduce un String: ");
            String str = br.readLine();

            //  Leer un int
            System.out.print("Introduce un numero entero (int): ");
            int numInt = Integer.parseInt(br.readLine());

            //  Leer un float
            System.out.print("Introduce un numero (float): ");
            float numFloat = Float.parseFloat(br.readLine());

            // Leer un double
            System.out.print("Introduce un numero (double): ");
            double numDouble = Double.parseDouble(br.readLine());

            // Mostrar los datos recopilados
            System.out.println("Has introducido :");
            System.out.println("String: " + str);
            System.out.println("Enter: " + numInt);
            System.out.println("Float: " + numFloat);
            System.out.println("Double: " + numDouble);
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error de conversió a número: " + e.getMessage());
        }
    }
}