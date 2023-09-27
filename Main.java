import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("*******************************************");
            System.out.println("Menú Principal:");
            System.out.println("1. Realizar Operaciones Matemáticas");
            System.out.println("2. Calcular Media de Notas");
            System.out.println("3. Salir");
            System.out.println("*******************************************");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realitzarOperacionsMatematiques();
                    break;
                case 2:
                    calcularMitjanaNotes();
                    break;
                case 3:
                    System.out.println("Saliendo del programa. ¡Gracias por usarlo!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Esta opción no es válida. Por favor, seleccione una operación válida.");
            }
        }
    }

    public static void realitzarOperacionsMatematiques() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;

        double divResult;
        if (num2 != 0) {
            divResult = (double) num1 / num2;
        } else {
            System.out.println("No es posible dividir por 0.");
            return;
        }

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + divResult);
    }

    public static void calcularMitjanaNotes() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del alumno: ");
        String nomAlumne = scanner.nextLine();

        System.out.print("Introduce la nota de la primera evaluación: ");
        double notaAvaluacio1 = scanner.nextDouble();

        System.out.print("Introduce la nota de la segunda evaluación: ");
        double notaAvaluacio2 = scanner.nextDouble();

        System.out.print("Introduce la nota de la tercera evaluación: ");
        double notaAvaluacio3 = scanner.nextDouble();

        double mitjana = (notaAvaluacio1 + notaAvaluacio2 + notaAvaluacio3) / 3;

        System.out.println("La media de las notas de " + nomAlumne + " es: " + mitjana);
    }
}