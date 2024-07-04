package br.com.newton.dominio;

import java.util.Objects;

public class Conta implements Transacao{
    private Integer numero;
    private Double saldo;

    public Double sacar(Double valor) {
        saldo -= valor;
        return saldo;
    }

    public Double depositar(Double valor) {
        saldo += valor;
        return saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(numero, conta.numero) && Objects.equals(saldo, conta.saldo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, saldo);
    }

    @Override
    public void transferir(Conta contaDestino, Double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
