package Clases;

public class CicloFor {

    private int acumulador = 0; // Para suma

    public void cicloForRecursivo(int in, int fi, int inc, int tipo, int extra) {
        if (in > fi) {
            // Si llegamos al final, mostramos resultado si aplica
            if (tipo == 2) { // suma
                System.out.println("La suma es: " + acumulador);
                acumulador = 0; // Reiniciar para futuros usos
            }
            return;
        }

        switch (tipo) {
            case 1: // Imprimir números
                System.out.println(in);
                break;
            case 2: // Sumar números
                acumulador += in;
                break;
            case 3: // Tabla de multiplicar
                System.out.println(extra + " x " + in + " = " + (extra * in));
                break;
            case 4: // Mostrar pares
                if (in % 2 == 0) System.out.println(in);
                break;
            case 5: // FizzBuzz
                if (in % 3 == 0 && in % 5 == 0)
                    System.out.println("FizzBuzz");
                else if (in % 3 == 0)
                    System.out.println("Fizz");
                else if (in % 5 == 0)
                    System.out.println("Buzz");
                else
                    System.out.println(in);
                break;
            default:
                System.out.println("Tipo de operación no válido");
                return;
        }

        cicloForRecursivo(in + inc, fi, inc, tipo, extra);
    }
}