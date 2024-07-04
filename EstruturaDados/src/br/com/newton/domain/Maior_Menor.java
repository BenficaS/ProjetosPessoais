package br.com.newton.domain;

import java.util.Random;

public class Maior_Menor {
    public static void main(String[] args) {
        int vetor[];
        vetor = new int[50];
        Random numrandomico = new Random();
        int maxvalue = Integer.MIN_VALUE;
        int minvalue = Integer.MAX_VALUE;

        for (int i = 0; i < 50; i++) {
            vetor[i] = numrandomico.nextInt(999);
        }
        for (int i = 0; i < 50; i++) {
            if (vetor[i] > maxvalue)
                maxvalue = vetor[i];
            if (vetor[i] < minvalue)
                minvalue = vetor[i];
        }
        System.out.println("o maior valor é  " + maxvalue);
        System.out.println("o menor valor é  " + minvalue);
        System.out.print("vetor randomico");
        for (int num : vetor) {
            System.out.print(" " + num);
        }


    }
}
