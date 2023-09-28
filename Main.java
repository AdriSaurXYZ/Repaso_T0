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
            System.out.println("4. Leer contenido del archivo");
            System.out.println("5. Escribir en el archivo");
            System.out.println("6. Salir");
            System.out.println("*******************************************");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    OperacionesMatematicas.realizarOperacionsMatematiques();
                    break;
                case 2:
                    Notas.calcularMitjanaNotes();
                    break;
                case 3:
                    CalcularSalario.calcularSalario();
                    break;
                case 4:
                    GestorFitxers.llegir("fitxer.txt");
                    break;
                case 5:
                    System.out.print("Introduzca el texto a escribir en el archivo: ");
                    scanner.nextLine(); // Consumir la nueva línea pendiente
                    String texto = scanner.nextLine();
                    GestorFitxers.escriure("fitxer.txt", texto);
                    break;
                case 6:
                    System.out.println("Saliendo del programa. ¡Gracias por usarlo!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Esta opción no es válida. Por favor, seleccione una operación válida.");
            }
        }
    }
}