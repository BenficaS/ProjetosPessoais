package ui;

import Retangulo.Retangulo;

import java.util.Scanner;

public class Calculador {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();

        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com a alutra depois a largura do retangulo:");

        retangulo.altura = ler.nextDouble();

        retangulo.largura = ler.nextDouble();


        System.out.println("A area do triangulo é: " + retangulo.area());
        System.out.println("A area do perimetro é: " + retangulo.Perimetro());
        double Diagonal = retangulo.Diagonal();
        System.out.printf(" a Diagonal é : %2f%n", Diagonal);
        ler.close();

    }
}
