package br.com.newtonpaiva.domain;

import java.math.BigDecimal;

public class VeiculoCarga implements Calcular{
    private Long horas;
    private Integer eixos;
    private BigDecimal valorHora;

    public VeiculoCarga(Long horas, Integer eixos, BigDecimal valorHora) {
        this.horas = horas;
        this.eixos = eixos;
        this.valorHora = valorHora;
    }
    public BigDecimal execute(){
        return valorHora.abs().multiply(eixos).multiply(new BigDecimal(horas));
    }
}
