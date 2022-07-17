package com.dio.arrays;

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {-5, -7, 14, 45, 33, 56};
        System.out.print("Vetor inverso: ");

        for (int i = (vetor.length-1); i>=0; i--){
            System.out.print(vetor[i]+" ");
        }
    }
}
