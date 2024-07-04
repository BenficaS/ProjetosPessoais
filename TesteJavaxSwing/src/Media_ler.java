import javax.swing.JOptionPane;

public class Media_ler {
    public static void main(String[] args) {
        float nota1,nota2,nota3,calculoMedia;

        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota  : "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota : "));

        calculoMedia = (nota1+nota2)/2;

        JOptionPane.showMessageDialog(null,"Resultado da Media = " + calculoMedia,"Resultado",JOptionPane.INFORMATION_MESSAGE);
    }
}
