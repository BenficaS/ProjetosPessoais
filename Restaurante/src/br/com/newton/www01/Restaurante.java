package br.com.newton.www01;
import javax.swing.JOptionPane;

public class Restaurante {

    public static void main(String[] args) {
        //h1.nomeHamburguer("Artesanal");
        //System.out.println(h1.nome);
        //h1.hamburguerArtesanal("Sim",10.5);
        //p1.bordaPizza("Sim" ,10.0);
        //p1.nomePizza("Calabreza");
        //System.out.println(p1.nome);
        Pizza p1 = new Pizza();
        Hamburguer h1 = new Hamburguer();

        int opcao,borda,artesanal;

        String nome;

        Double valor;



        opcao=Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n1 - Pizza\n2 - Hamburguer\n3 sair."));

        switch (opcao){
            case 1 :
                nome=JOptionPane.showInputDialog("Escreva o nome da Pizza: ");
                valor=Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da pizza "));
                borda=Integer.parseInt(JOptionPane.showInputDialog("Possui borda digite 1 para sim ou 2 para não:"));
                p1.setValor(p1.bordaPizza(borda,valor));
                JOptionPane.showMessageDialog(null,"O valor total ficou: " + p1.getValor(),"resultado",JOptionPane.INFORMATION_MESSAGE);
            break;
            case 2 :
                nome=JOptionPane.showInputDialog("Escreva o nome do Hmburguer: ");
                valor=Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor do hamburguer: "));
                artesanal=Integer.parseInt(JOptionPane.showInputDialog("Será artesanal digite 1 sim ou 2 para não"));
                h1.setValor(h1.hamburguerArtesanal(artesanal,valor));
                JOptionPane.showMessageDialog(null,"O valor total ficou: " + h1.getValor(),"Resultado",JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Escolha uma opção valida","",JOptionPane.ERROR_MESSAGE);
        }
    }
}
