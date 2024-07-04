package br.com.newton.cliente;

public class Ingresso {
    private String nomeJogo;
    private Double valor;
    private Integer quantidadeIngreso;


    public Integer getQuantidadeIngreso() {
        return quantidadeIngreso;
    }
    public void setQuantidadeIngreso(Integer quantidadeIngreso) {
        this.quantidadeIngreso = quantidadeIngreso;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
