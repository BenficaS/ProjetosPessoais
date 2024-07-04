package br.com.newton.dominio;

public interface Transacao {
    void transferir(Conta contaDestino,Double valor);
}
