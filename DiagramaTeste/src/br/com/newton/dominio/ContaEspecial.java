package br.com.newton.dominio;

public class ContaEspecial extends Conta{
    private Double limite;

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
}
