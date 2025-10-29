package Clases;

import java.util.Scanner;

public class Menu {

    public static void menuPrincipal(){
        Scanner sc = new Scanner(System.in);
        int op;
        do{
            System.out.println("\t\t\t\t.=======================================================================.");
            System.out.println("\t\t\t\t|                            MENU PRINCIPAL                             |");
            System.out.println("\t\t\t\t:=======================================================================:");
            System.out.println("\t\t\t\t|      1.- Ciclo For | 2.- Ciclo While | -1.- Salir  del sistema        |");
            System.out.println("\t\t\t\t'======================================================================='");
            System.out.print("Ingrese opcion: ");
            op = sc.nextInt();
            switch(op){
            case 1:
                menuFor();
                break;
            case 2:
                menuWhile();
                break;
            case -1:
                System.out.println("Saliendo del sistema...");
                break;
            default:
                System.out.println("Opcion no valida.");
            }
        }while(op!=-1);
    }

    public static void menuFor(){
        Scanner sc = new Scanner(System.in);
        CicloFor cf = new CicloFor();
        int op, num;
        do{
            System.out.println("\n\t--- MENU CICLO FOR ---");
            System.out.println("1. Imprimir del 1 al 100");
            System.out.println("2. Sumar los primeros 50 números");
            System.out.println("3. Mostrar tabla de multiplicar");
            System.out.println("4. Mostrar números pares");
            System.out.println("5. FizzBuzz");
            System.out.println("-1. Volver");
            System.out.print("Ingrese opción: ");
            op = sc.nextInt();

            switch(op){
                case 1:
                    cf.cicloForRecursivo(1, 100, 1, 1, 0);
                    break;
                case 2:
                    cf.cicloForRecursivo(1, 50, 1, 2, 0);
                    break;
                case 3:
                    System.out.print("Ingrese el número de la tabla: ");
                    num = sc.nextInt();
                    cf.cicloForRecursivo(1, 10, 1, 3, num);
                    break;
                case 4:
                    cf.cicloForRecursivo(1, 100, 1, 4, 0);
                    break;
                case 5:
                    System.out.print("Hasta qué número desea llegar: ");
                    num = sc.nextInt();
                    cf.cicloForRecursivo(1, num, 1, 5, 0);
                    break;
                case -1:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while(op != -1);
    }

    public static void menuWhile() {
        Scanner sc = new Scanner(System.in);
        CicloWhile cw = new CicloWhile();
        int op, num;
        do {
            System.out.println("\n\t--- MENU CICLO WHILE ---");
            System.out.println("1. Imprimir números del 1 al 10");
            System.out.println("2. Sumar números del 1 al n");
            System.out.println("3. Mostrar números pares hasta 20");
            System.out.println("4. Contar regresivamente desde n");
            System.out.println("5. Calcular factorial de un número");
            System.out.println("-1. Volver");
            System.out.print("Ingrese opción: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    cw.cicloWhileRecursivo(1, 10, 1, 0);
                    break;
                case 2:
                    System.out.print("Ingrese un número n: ");
                    num = sc.nextInt();
                    cw.cicloWhileRecursivo(num, 0, 2, 0);
                    break;
                case 3:
                    cw.cicloWhileRecursivo(1, 20, 3, 0);
                    break;
                case 4:
                    System.out.print("Ingrese un número: ");
                    num = sc.nextInt();
                    cw.cicloWhileRecursivo(num, 0, 4, 0);
                    break;
                case 5:
                    System.out.print("Ingrese un número: ");
                    num = sc.nextInt();
                    cw.cicloWhileRecursivo(num, 0, 5, 1);
                    break;
                case -1:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (op != -1);
    }
}
