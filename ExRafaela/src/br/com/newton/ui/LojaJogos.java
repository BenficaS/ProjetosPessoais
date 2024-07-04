package br.com.newton.ui;

import br.com.newton.cliente.Cliente;
import br.com.newton.cliente.Ingresso;
import br.com.newton.cliente.Pedido;

import javax.swing.*;
import java.util.ArrayList;

public class LojaJogos {

    public static void main(String[] args) {

        String nomeC, jogoAtual,mensagem= "", mensagemJogos="";
        Double valorJogo,auxiliarValor=0.0;
        Integer opcao = 0,quantIngresso,posicao=0;


        nomeC = JOptionPane.showInputDialog("Entre como o nome do cliente: ");
        Cliente nomeCliente = new Cliente();
        nomeCliente.setNome(nomeC);

        Pedido p1 = new Pedido();
        p1.setIngressos(new ArrayList<>());

        do {
            jogoAtual = JOptionPane.showInputDialog("Entre com o nome do jogo Ex. Cruzeiro X Atletico :");
            Ingresso i1 = new Ingresso();
            i1.setNomeJogo(jogoAtual);

            valorJogo = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor dos ingressos: "));
            i1.setValor(valorJogo);

            quantIngresso = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de ingressos."));
            i1.setQuantidadeIngreso(quantIngresso);


            p1.getIngressos().add(i1);
            p1.calcValor(i1);
            auxiliarValor+=p1.getValorTotal();

            opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja adquirir um novo ingresso para outro jogo?  \n1 - sim.\n2 - não."));

        } while (opcao == 1);


        for (Ingresso ingresso : p1.getIngressos()){
            if (posicao == p1.getIngressos().size() - 1)
            mensagemJogos += ingresso.getQuantidadeIngreso() + " Ingresso(s) : " + ingresso.getNomeJogo();
            else
                mensagemJogos+=ingresso.getQuantidadeIngreso()+" Ingresso(s) : " + ingresso.getNomeJogo() + "\n";
        }
        mensagem = " Pedido feito para " + nomeCliente.getNome() + "\n" + mensagemJogos+" no valor de : " + auxiliarValor;
        JOptionPane.showMessageDialog(null,mensagem);

    }
}
