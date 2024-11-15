
import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSelecciona una operacion:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");

            int opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 5) {
                System.out.print("Ingresa el primer numero: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingresa el segundo numero: ");
                double num2 = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado de la suma: " + sumar(num1, num2));
                        break;
                    case 2:
                        System.out.println("Resultado de la resta: " + restar(num1, num2));
                        break;
                    case 3:
                        System.out.println("Resultado de la multiplicación: " + multiplicar(num1, num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado de la división: " + dividir(num1, num2));
                        } else {
                            System.out.println("Error: No se puede dividir entre cero.");
                        }
                        break;
                    case 5:
                        if (num2 != 0) {
                            System.out.println("Resultado del módulo: " + modulo(num1, num2));
                        } else {
                            System.out.println("Error: El divisor no puede ser cero.");
                        }
                        break;
                }
            } else if (opcion == 6) {
                continuar = false;
                System.out.println("Saliendo de la calculadora...");
            } else {
                System.out.println("Opción no válida. Intenta nuevamente.");
            }
        }

        scanner.close();
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
    
    public static double modulo(double a, double b) {
        return a % b;
    }
}
