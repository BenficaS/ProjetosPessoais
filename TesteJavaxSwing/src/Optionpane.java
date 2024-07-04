import javax.swing.JOptionPane;
public class Optionpane {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o nome : ");
        String sobrenome = JOptionPane.showInputDialog("digite o sobrenome: ");

        String nomeCompleto = nome + "  " + sobrenome;

        JOptionPane.showMessageDialog(null , "Nome Completo : " +nomeCompleto, "Informação " , JOptionPane.WARNING_MESSAGE);
    }
}
