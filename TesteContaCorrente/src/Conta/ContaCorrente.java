package Conta;

public class ContaCorrente {
    private Double saldo;

    public Integer numeroConta;

    private Cliente cliente;

    public Double deposita(Double valor){

        this.saldo +=valor;

        return saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
