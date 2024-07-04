package br.com.newton.www01;

public class Pizza {
    public String nome;
    private Double valor;
    public Integer borda;

    public Double bordaPizza(Integer borda,Double valor) {

        if (borda == 1) {
            valor = valor + 5;
        }
        else{

        }
        return valor;

    }

    public String nomePizza(String pizza) {
        this.nome = pizza;
        return pizza;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
