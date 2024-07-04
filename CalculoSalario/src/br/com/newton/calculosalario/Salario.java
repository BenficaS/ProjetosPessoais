package br.com.newton.calculosalario;

public class Salario {
    private Double salario;
    private Double taxa=1000.0;
    private Double porcentagem;
    private Double valorTotal;
    public Double calculo(){
        valorTotal = getSalario()-getTaxa();
        return valorTotal;
    }
    public Double calculoPorcentagem(){
        valorTotal=(getPorcentagem()*getSalario())/100;
        valorTotal = valorTotal + this.salario;
        return valorTotal;
    }


    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(Double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
}
