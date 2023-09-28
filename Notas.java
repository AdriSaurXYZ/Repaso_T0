import java.util.Scanner;

public class Notas {
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

