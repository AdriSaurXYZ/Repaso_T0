import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("*******************************************");
            System.out.println("Menú Principal:");
            System.out.println("1. Realizar Operaciones Matemáticas");
            System.out.println("2. Calcular Media de Notas");
            System.out.println("3. Calcular Salario");
            System.out.println("4. Entrada Datos");
            System.out.println("5. Escribir en el archivo ");
            System.out.println("6. Leer contenido del archivo ");
            System.out.println("7. Salir");
            System.out.println("*******************************************");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    OperacionesMatematicas.realizarOperacionsMatematiques(); // Llama al método "realizarOperacionsMatematiques" de la clase OperacionesMatematicas
                    break;
                case 2:
                    Notas.calcularMitjanaNotes(); // Llama al método "calcularMitjanaNotes" de la clase Notas
                    break;
                case 3:
                    CalcularSalario.calcularSalario(); // Llama al método "calcularSalario" de la clase CalcularSalario
                    break;
                case 4:
                    EntradaDatos.main(null); // Llama al método "main" de la clase EntradaDatos
                    break;
                case 5:
                    System.out.print("Introduzca el texto a escribir en el archivo: ");
                    scanner.nextLine();
                    String texto = scanner.nextLine();
                    GestorFitxers.escriure("fitxer.txt", texto); // Llama al método "escriure" de la clase GestorFitxers
                    break;
                case 6:
                    GestorFitxers.llegir("fitxer.txt"); // Llama al método "llegir" de la clase GestorFitxers
                    break;
                case 7:
                    System.out.println("Saliendo del programa. ¡Muchas gracias!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Esta opción no es válida. Por favor, seleccione una operación válida.");
            }
        }
    }
}