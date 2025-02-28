package br.com.newtonpaiva.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ticket {
    private LocalDateTime inicio;

    private LocalDateTime fim;

    private Veiculo veiculo;

    public Ticket(LocalDateTime inicio, Veiculo veiculo) {
        this.inicio = inicio;
        this.veiculo = veiculo;
    }

    public BigDecimal fechar() {
        this.fim = LocalDateTime.now();

        long horas = ChronoUnit.HOURS.between(inicio, fim);
        long dias = ChronoUnit.DAYS.between(inicio, fim);
        long meses = ChronoUnit.MONTHS.between(inicio, fim);

//        if (horas < 12) {
//            return new BigDecimal(horas * 10);
//        } else if (dias < 15) {
//            if (dias == 0)
//                dias = 1;
//            return new BigDecimal(dias * 40);
//        } else {
//            if (meses == 0)
//                meses = 1;
//            return new BigDecimal(meses * 200);
//        }
//
//        // TODO calcular valor
//        return BigDecimal.ZERO;
//    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
}
