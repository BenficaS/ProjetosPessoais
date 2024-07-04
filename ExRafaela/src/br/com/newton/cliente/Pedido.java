package br.com.newton.cliente;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    public Cliente cliente;
    private ArrayList <Ingresso> ingressos;
    private Double valorTotal;
    public Double calcValor(Ingresso ingresso){
        valorTotal = ingresso.getValor() * ingresso.getQuantidadeIngreso();
        return valorTotal;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(ArrayList<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }
}
