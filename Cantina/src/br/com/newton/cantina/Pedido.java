package br.com.newton.cantina;

import br.com.newton.cantina.Cliente;
import br.com.newton.cantina.Ingrediente;
import br.com.newton.cantina.Massa;

import java.util.ArrayList;

public class Pedido {

    public Massa massa;
    public Cliente cliente;

    private ArrayList<Ingrediente> listaIngredientes;
    private Double valorTotal;

    public void calculaValor(Massa massa){
        valorTotal = massa.valorMassa + listaIngredientes.size() * 2;

    }

    public ArrayList<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(ArrayList<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
