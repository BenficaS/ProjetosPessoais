package br.newton.funcionario;

public class Funcionario {
    public String nome;
    public Double salario;
    public Double imposto;
    public Double calculo;
    public Double porcentagem;

    public String nomeFunc(String nomef){
        return nome = nomef;
    }
    public Double salarioFunc(Double salarioF){
        salario=salarioF;
        return salario;
    }
    public Double salarioImposto(Double fimp){
        imposto=fimp;
        calculo=salario-imposto;
        return imposto;
    }
    public Double salarioF(){
         salario = (porcentagem*salario)/100;
         salario = salario + calculo;
        return salario;
    }
}
