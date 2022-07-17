package com.dio.loops;

import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int count = 0;
        int numeros;
        int quantPares=0, quantImpares=0;
        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();


        do {
            System.out.println("Número: ");
            numeros = scan.nextInt();
            if (numeros%2==0) quantPares++;
            else quantImpares++;

            count++;
        }while (count<quantNumeros);
        System.out.println("Quantidade de pares: "+quantPares);
        System.out.println("Quantidade de impares: "+quantImpares);
    }
}
