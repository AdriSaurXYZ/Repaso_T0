import java.util.Scanner;

public class CalcularSalario {
    public static double calcularSalario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas trabajadas al día: ");
        double horasPorDia = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de días trabajados al mes: ");
        int diasPorMes = scanner.nextInt();

        System.out.print("Ingrese la tarifa por hora: ");
        double tarifaPorHora = scanner.nextDouble();

        double salarioMensual = horasPorDia * diasPorMes * tarifaPorHora;


        System.out.println("El salario mensual del trabajador es: $" + salarioMensual);
        return salarioMensual;
    }

    public static double calcularS(double horasPorDia, int diasPorMes, double tarifaPorHora) {
        // Calcular el salario multiplicando las horas trabajadas por la tarifa por hora
        double salarioMensual = horasPorDia * diasPorMes * tarifaPorHora;
        return salarioMensual;
    }
}


