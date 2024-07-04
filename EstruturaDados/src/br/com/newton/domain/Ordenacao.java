package br.com.newton.domain;

import java.util.Scanner;

public class Ordenacao {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] num = new int[5];
        int aux;
        for (int i = 0; i < 5; i++) {
            System.out.println("Entre com numeros: ");
            num[i] = ler.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int a = 0; a < 4; a++) {
                if (num[a] > num[a + 1]) {
                    aux = num[a];
                    num[a] = num[a + 1];
                    num[a + 1] = aux;
                    System.out.println("vetor ordenado");

                }

            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }
    }
}

