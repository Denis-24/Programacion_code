package org.example;

import java.util.Scanner;

public class Prueba_1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int modo = 0;
        String isbn_ejemplo = "xxxxxxxxxx";
        int limite = isbn_ejemplo.length();
        int limite_1 = 0;
        int limite_2 = 0;

        System.out.println("!Validador de ISBN!");
        System.out.println("(1) Validar ISBN");
        System.out.println("(2) Reparar ISBN");
        System.out.println("(3) Salir");
        System.out.println("Introduce el modo...");


        boolean control = true;
        if (teclado.hasNextInt()){
            modo = teclado.nextInt();
        }else {
            System.out.println("Valor introducido incorrecto.");
            control = false;
        }

        if (control){
            switch (modo){
                case 1:
                    System.out.println("Introduce el ISBN para validar.");
                    String validar = teclado.next();

                    limite_1 = validar.length();

                    if (limite_1 < limite || limite_1 > limite){
                        System.out.println("ISBN introducido incorrecto.");
                    }

                    int suma = 0;

                    for (int i = 0; i < 10; i++) {
                        char c = validar.charAt(i);
                        int valor;

                        // Si es 'X' en la última posición, vale 10
                        if (c == 'X' && i == 9) {
                            valor = 10;
                        } else {
                            valor = Integer.parseInt(String.valueOf(c)); // convierte el carácter en número
                        }

                        int peso = 10 - i; // pesos de 10 a 1
                        int producto = valor * peso;

                    }

                    if (suma % 11 == 0) {
                        System.out.println("El ISBN es valido.");
                    } else {
                        System.out.println("El ISBN no es valido.");
                    }
                    System.out.println("hola");

                    break;
                case 2:
                    System.out.println("Introduce el ISBN para reparar.");
                    String reparar = teclado.next();

                    limite_2 = reparar.length();

                    if (limite_2 < limite || limite_2 > limite){
                        System.out.println("ISBN introducido incorrecto.");
                    }
                    break;
                case 3:
                    break;
            }
        }
    }
}