package Retangulo;

public class Retangulo {
    public Double largura;
    public Double altura;


    public Double area() {
        return largura * altura;
    }

    public Double Perimetro() {
        return 2 * (altura + largura);
    }

    public Double Diagonal() {
        return Math.sqrt(Math.pow(largura, 2)) + Math.sqrt(Math.pow(altura, 2));
    }
}






