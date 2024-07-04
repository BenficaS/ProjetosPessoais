package br.com.newton.acai;

public class Acai {
    public Integer tamanho;
    public Double valor = 0.0;
    public Integer acrescimos;

    public Double calculaAcai(Integer tamanho) {
        if(tamanho==1)
            valor+=8;
        if (tamanho==2)
            valor+=10;
        if (tamanho==3)
            valor+=12;
        return valor;
    }
    public Double acrescimoSorvete(Integer acrescimos){
        if(acrescimos==1)
            valor+=2;
        return valor;

    }

}
