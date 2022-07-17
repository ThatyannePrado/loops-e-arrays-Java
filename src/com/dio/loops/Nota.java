package com.dio.loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;
        while (true){
            System.out.println("Nota: ");
            nota = scan.nextInt();
            if ((nota>=0)&&(nota<=10)){
                System.out.println("Programa finalizado ...");
                break;

            } else {
                System.out.println("Nota inválida! Digite novamente: ");
            }
        }
    }
}
