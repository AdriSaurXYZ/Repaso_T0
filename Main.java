import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creem un objecte Scanner per llegir l'entrada de l'usuari
        Scanner scanner = new Scanner(System.in);

        // Demanem a l'usuari que introdueixi dos nombres enters
        System.out.print("Introduïu el primer nombre: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduïu el segon nombre: ");
        int num2 = scanner.nextInt();

        // Calculem les operacions
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacio = num1 * num2;

        // Assegurem-nos que no es divideixi per zero
        double divResult;
        if (num2 != 0) {
            divResult = (double) num1 / num2;
        } else {
            System.out.println("No es pot dividir per zero.");
            return; // Sortim del programa si es divideix per zero
        }

        // Mostrem els resultats
        System.out.println("La suma és: " + suma);
        System.out.println("La resta és: " + resta);
        System.out.println("La multiplicació és: " + multiplicacio);
        System.out.println("La divisió és: " + divResult);

        // Tanquem el scanner
        scanner.close();
    }
}