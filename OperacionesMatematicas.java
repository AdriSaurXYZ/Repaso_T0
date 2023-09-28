import java.util.Scanner;

public class OperacionesMatematicas {
        public static void realizarOperacionsMatematiques() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce el primer número: ");
            int num1 = scanner.nextInt();

            System.out.print("Introduce el segundo número: ");
            int num2 = scanner.nextInt();

            int suma = num1 + num2; //Se realiza la suma de los 2 numeros anteriores
            int resta = num1 - num2; //Se realiza la resta de los 2 numeros anteriores
            int multiplicacion = num1 * num2; //Se realiza la multiplicación de los 2 numeros anteriores

            double divResult;
            if (num2 != 0) {
                divResult = (double) num1 / num2;  //Se realiza la divisionde los 2 numeros anteriores
            } else {
                System.out.println("No es posible dividir por 0.");
                return;
            }

            //Aparecen por pantalla todos los datos
            System.out.println("La suma es: " + suma);
            System.out.println("La resta es: " + resta);
            System.out.println("La multiplicación es: " + multiplicacion);
            System.out.println("La división es: " + divResult);
        }
    }

