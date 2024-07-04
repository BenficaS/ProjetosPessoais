package ui;

import br.com.newton.cantina.Cliente;
import br.com.newton.cantina.Ingrediente;
import br.com.newton.cantina.Massa;
import br.com.newton.cantina.Pedido;

import javax.swing.*;
import java.text.ParseException;
import java.util.ArrayList;

public class Cantina {
    public static void main(String[] args) {
        String nomeCliente, nomeMassa;

        Double valorMassa = 1.1;

        Integer opcao = 0;


        nomeCliente = JOptionPane.showInputDialog("Informe o nome do cliente: ");

        nomeMassa = JOptionPane.showInputDialog("Informe o nome da massa: ");
        try {
            valorMassa = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da massa: "));


            // caso eu utilizar meu atributo em private, utilizar set para colocar o nome dentro do meu atributo nomeCliente.

            Cliente cliente1 = new Cliente();

            cliente1.setNome(nomeCliente);

            // caso eu utilizar meu atributo publico buscar o tipo para receber o nome da massa o qual é meu objeto em questão.

            Massa massa1 = new Massa();

            massa1.tipo = nomeMassa;

            massa1.valorMassa = valorMassa;

            Pedido pedido1 = new Pedido();

            pedido1.setListaIngredientes(new ArrayList<>());

            while (opcao != 5) {

                opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe os ingredientes escolhidos : \n 1 - Bacon \n 2 - Mussarela \n 3 - tomate \n4 - Queijo \n5 - Sair"));

                switch (opcao) {


                    case 1:
                        Ingrediente ingrediente1 = new Ingrediente();
                        ingrediente1.setNomeIngrediente("Bacon");
                        pedido1.getListaIngredientes().
                                add(ingrediente1);
                        break;

                    case 2:
                        Ingrediente ingrediente2 = new Ingrediente();
                        ingrediente2.setNomeIngrediente("Mussarela");
                        pedido1.getListaIngredientes()
                                .add(ingrediente2);
                        break;
                    case 3:
                        Ingrediente ingrediente3 = new Ingrediente();
                        ingrediente3.setNomeIngrediente("Tomate");
                        pedido1.getListaIngredientes()
                                .add(ingrediente3);
                        break;
                    case 4:
                        Ingrediente ingrediente4 = new Ingrediente();
                        ingrediente4.setNomeIngrediente("Queijo");
                        pedido1.getListaIngredientes()
                                .add(ingrediente4);
                        break;

                }

            }
            String mensagem = " ";
            int posicao = 0;

            for (Ingrediente item : pedido1.getListaIngredientes()) {
                if (posicao == pedido1.getListaIngredientes().size() - 2) {
                    mensagem += item.getNomeIngrediente() + " e ";
                } else if (posicao == pedido1.getListaIngredientes().size() - 1) {
                    mensagem += item.getNomeIngrediente() + ".";
                } else {
                    mensagem += item.getNomeIngrediente() + ", ";
                }
                posicao++;
            }

            pedido1.calculaValor(massa1);

            JOptionPane.showMessageDialog(null, "Pedido feito para " + cliente1.getNome() + "\n" + massa1.tipo + " com " + mensagem + "\nValor: " + pedido1.getValorTotal());

            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema.", "", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: Entre com um valor numerico.");
        }

    }
}

