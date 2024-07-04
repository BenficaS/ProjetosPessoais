package br.com.newton.acai;
import  javax.swing.JOptionPane;

public class PontoAcai {
    public static void main(String[] args) {
        int opcao;
        double tamanho;
        int opcaoAcrecimo;

        opcao=Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção : \n1 Para tamanho acai 300g \n2 Para tamanho de 500g\n3 Para tamanho de 700"));
        opcaoAcrecimo=Integer.parseInt(JOptionPane.showInputDialog("havera acrescimo?: \n 1 sim \n 2 não"));

        Acai ac1 = new Acai();
        ac1.calculaAcai(opcao);
        ac1.acrescimoSorvete(opcaoAcrecimo);

        JOptionPane.showMessageDialog(null,"o seu açai ficou no valor de : " + ac1.valor);
    }
}

