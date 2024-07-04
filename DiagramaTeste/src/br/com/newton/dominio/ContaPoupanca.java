package br.com.newton.dominio;

public class ContaPoupanca extends Conta{
    public Double aplicarRendimentos(Double percentual){
        setSaldo(getSaldo() + getSaldo() * percentual /100);
        return getSaldo() * percentual /100;
    }
}
