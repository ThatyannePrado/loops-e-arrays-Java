package com.dio.arrays;

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length;i++){
            for (int j = 0; j < matriz.length;j++) {
                int numero = random.nextInt(10);
                matriz[i][j] = numero;
            }
        }

        System.out.println("Matriz: ");
        for (int linha[]:matriz) {
            for (int numero: linha) {
                System.out.print(numero+" ");
            }
            System.out.print("\n");
        }

    }
}
