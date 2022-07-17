package com.dio.loops;

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;
        double media;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            soma += numero;
            media = soma/5.0;
            if (numero>maior) maior = numero;
            count+=1;
        }while (count<5);

        System.out.println("Maior: "+maior);
        System.out.println("Média: "+media);
    }
}
