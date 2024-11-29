import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            realizarOperacion(opcion, scanner);
        } while (opcion != 6);

        System.out.println("¡Gracias por usar la calculadora!");
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("Seleccione una operación:");
        System.out.println("1. Sumar dos números");
        System.out.println("2. Restar dos números");
        System.out.println("3. Calcular la potencia de un número");
        System.out.println("4. Dividir dos números");
        System.out.println("5. Calcular el factorial de un número");
        System.out.println("6. Calcular la multiplicación de dos  números");
        System.out.println("7. Salir");
        System.out.print("Opción: ");
    }

    private static void realizarOperacion(int opcion, Scanner scanner) {
        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + sumar(scanner));
                break;
            case 2:
                System.out.println("Resultado: " + restar(scanner));
                break;
            case 3:
                System.out.println("Resultado: " + calcularPotencia(scanner));
                break;
            case 4:
                dividir(scanner);
                break;
            case 5:
                System.out.println("Resultado: " + calcularFactorial(scanner));
                break;
            case 6:
                System.out.println("Resultado: " + calcularMultiplicación(scanner));
                break;
            case 7:
                break;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
                break;
        }
    }

    private static int sumar(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        return a + b;
    }

    private static int restar(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        return a - b;
    }

    private static double calcularPotencia(Scanner scanner) {
        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();
        return Math.pow(base, exponente);
    }

    private static void dividir(Scanner scanner) {
        System.out.print("Ingrese el numerador: ");
        int numerador = scanner.nextInt();
        System.out.print("Ingrese el denominador: ");
        int denominador = scanner.nextInt();
        if (denominador != 0) {
            System.out.println("Resultado: " + (double) numerador / denominador);
        } else {
            System.out.println("Error: División por cero no permitida.");
        }
    }

    private static long calcularFactorial(Scanner scanner) {
        System.out.print("Ingrese un número positivo: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Error: El número debe ser positivo.");
            return -1;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static int calcularMultiplicación(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        return a * b;
    }
}
