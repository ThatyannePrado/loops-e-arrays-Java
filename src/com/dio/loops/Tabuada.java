package com.dio.loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.println("Tabuada desejada: ");
        numero = scan.nextInt();
        int count = 0;

        System.out.println("Tabuada de "+numero);

        do {
            System.out.println(numero+" x "+(count+1)+ " = "+(numero*(count+1)));
            count++;
        }while (count < 10);
    }
}
