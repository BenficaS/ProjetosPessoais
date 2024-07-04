import javax.swing.*;

public class TesteFrame {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Interface Grafica");

        JButton botao = new JButton("Botão do swing");

        JLabel texto = new JLabel("numero de click: 0");

        JPanel painel = new JPanel();
        painel.add(botao);
        painel.add(texto);
        janela.getContentPane().add(painel);
        janela.setSize(300,200);
        janela.show();
    }
}
