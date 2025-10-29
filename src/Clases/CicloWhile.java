package Clases;

public class CicloWhile {

    private int acumulador = 0; // Para sumar

    public void cicloWhileRecursivo(int n, int limite, int tipo, int extra) {
        // CASOS BASE (cuando se detiene la recursión)
        switch (tipo) {
            case 1: // Imprimir números 1–10
                if (n > limite) return;
                break;
            case 2: // Sumar 1–n
                if (n == 0) {
                    System.out.println("La suma es: " + acumulador);
                    acumulador = 0;
                    return;
                }
                break;
            case 3: // Números pares hasta 20
                if (n > limite) return;
                break;
            case 4: // Contar regresivamente
                if (n == 0) return;
                break;
            case 5: // Factorial
                if (n <= 1) {
                    System.out.println("El factorial es: " + extra);
                    return;
                }
                break;
            default:
                System.out.println("Tipo de operación no válido.");
                return;
        }

        // ACCIONES
        switch (tipo) {
            case 1: // Imprimir números 1–10
                System.out.println(n);
                cicloWhileRecursivo(n + 1, limite, tipo, 0);
                break;

            case 2: // Sumar 1–n
                acumulador += n;
                cicloWhileRecursivo(n - 1, limite, tipo, 0);
                break;

            case 3: // Mostrar pares
                if (n % 2 == 0) System.out.println(n);
                cicloWhileRecursivo(n + 1, limite, tipo, 0);
                break;

            case 4: // Contar regresivamente
                System.out.println(n);
                cicloWhileRecursivo(n - 1, limite, tipo, 0);
                break;

            case 5: // Factorial
                extra *= n;
                cicloWhileRecursivo(n - 1, limite, tipo, extra);
                break;
        }
    }
}