import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        int  opcion;
        double resultado, numero_1, numero_2;
        System.out.println("Ingrese el primer numero");
        numero_1 = lectura.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero_2 = lectura.nextInt();
        System.out.println("Ingrese que operacion desea realizar 1 Sumar, 2 Restar, 3 Dividir, 4 Multiplicar");
        opcion = lectura.nextInt();

        if (opcion == 4){
            resultado = numero_1 * numero_2;
            System.out.println(resultado);
        }

        if (opcion == 1){
            resultado = numero_1 + numero_2;
            System.out.println(resultado);
        }

        if (opcion == 2){
            resultado = numero_1 - numero_2;
            System.out.println(resultado);
        }

        if (opcion == 3){
            resultado = numero_1 / numero_2;
            System.out.println(resultado);
        }

        else {
            System.out.println("¡No podemos realizar esa operacion!");

        }


        System.out.println("Muy bien haz realizado tu cuenta");

       // resultado = numero_1 + numero_2;-
       //  System.out.println(resultado);
    }
}-+