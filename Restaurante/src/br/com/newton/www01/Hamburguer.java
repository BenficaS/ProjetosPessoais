package br.com.newton.www01;

public class Hamburguer {
    public String nome;
    private Double valor;
    public Integer artesanal;

    public Double hamburguerArtesanal(Integer artesanal ,Double valor){
        if (artesanal == 1)

            valor = valor + 8;


        return valor;
    }
    public String nomeHamburguer(String hamb){
        this.nome = hamb;

        return hamb;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
