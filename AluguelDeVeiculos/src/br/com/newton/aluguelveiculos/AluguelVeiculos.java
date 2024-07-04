package br.com.newton.aluguelveiculos;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class AluguelVeiculos extends JFrame {

    private static final long serialVersionUID = 1L;


    public static void main(String[] args) {

        AluguelVeiculos field = new AluguelVeiculos();
        field.testaAluguelVeiculos();

    }

    private void testaAluguelVeiculos() {

        Container janela = getContentPane();
        setLayout(null);
        JLabel labelnome1 = new JLabel("Nome: ");
        JLabel labelcpf = new JLabel("CPF: ");
        JLabel labeltel = new JLabel("Telefone: ");

        JLabel labelnome2 = new JLabel("Nome do carro: ");
        JLabel labelplaca = new JLabel("Placa: ");
        JLabel labelano = new JLabel("Ano: ");
        JLabel labeldatalocacao = new JLabel("Data de locação: ");
        JLabel labeldataentrega = new JLabel("Data de Entrega: ");

        labelnome1.setBounds(50, 40, 100, 20);
        labelcpf.setBounds(50, 80, 100, 20);
        labeltel.setBounds(50, 120, 100, 20);

        labelnome2.setBounds(50, 160, 100, 20);
        labelplaca.setBounds(50, 200, 100, 20);
        labelano.setBounds(50, 240, 100, 20);
        labeldatalocacao.setBounds(50, 280, 100, 20);
        labeldataentrega.setBounds(50, 320, 100, 20);

        MaskFormatter mascaranome1 = null;
        MaskFormatter mascaracpf = null;
        MaskFormatter mascaratel = null;

        MaskFormatter mascaranome2 = null;
        MaskFormatter mascaraplaca = null;
        try {
            mascaranome1 = new MaskFormatter("UUUUUUUUUUUUUUUU");
            mascaracpf = new MaskFormatter("###.###.###-##");
            mascaratel = new MaskFormatter("(##)#-####-####");

            mascaranome2 = new MaskFormatter("UUUUUUUUUUUUUUUU");
            mascaraplaca = new MaskFormatter("UUU#####");
        } catch (ParseException excp) {
            System.err.println("Erro de digitação: " + excp.getMessage());
            System.exit(-1);
        }
        JFormattedTextField JformatedTextFieldnome1 = new JFormattedTextField(mascaranome1);
        JFormattedTextField JformatedTextFieldcpf = new JFormattedTextField(mascaracpf);
        JFormattedTextField JformatedTextFieldtel = new JFormattedTextField(mascaratel);

        JFormattedTextField JformatedTextFieldnome2 = new JFormattedTextField(mascaranome2);
        JFormattedTextField JformatedTextFieldplaca = new JFormattedTextField(mascaraplaca);
        JFormattedTextField JformatedTextFieldano = new JFormattedTextField();
        JFormattedTextField JformatedTextFieldlocacao = new JFormattedTextField();
        JFormattedTextField JformatedTextFieldentrega = new JFormattedTextField();

        JformatedTextFieldnome1.setBounds(150, 40, 80, 20);
        JformatedTextFieldcpf.setBounds(150, 80, 80, 20);
        JformatedTextFieldtel.setBounds(150, 120, 80, 20);

        JformatedTextFieldnome2.setBounds(150, 160, 80, 20);
        JformatedTextFieldplaca.setBounds(150, 200, 80, 20);
        JformatedTextFieldano.setBounds(150, 240, 80, 20);
        JformatedTextFieldlocacao.setBounds(150, 280, 80, 20);
        JformatedTextFieldentrega.setBounds(150, 320, 80, 20);

        janela.add(labelnome1);
        janela.add(labelcpf);
        janela.add(labeltel);
        janela.add(labelnome2);
        janela.add(labelplaca);
        janela.add(labelano);
        janela.add(labeldatalocacao);
        janela.add(labeldataentrega);

        janela.add(JformatedTextFieldnome1);
        janela.add(JformatedTextFieldcpf);
        janela.add(JformatedTextFieldtel);

        janela.add(JformatedTextFieldnome2);
        janela.add(JformatedTextFieldplaca);
        janela.add(JformatedTextFieldano);
        janela.add(JformatedTextFieldlocacao);
        janela.add(JformatedTextFieldentrega);



        JButton botao = new JButton("Enviar.");
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botao.setText("Aluguel realizado com sucesso.");
            }

        });
        janela.add(botao);
        botao.setBounds(100,520,250,20);

        setSize(400, 620);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
