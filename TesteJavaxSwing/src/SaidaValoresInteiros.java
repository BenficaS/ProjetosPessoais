import javax.swing.JOptionPane;
public class SaidaValoresInteiros {
    public static void main(String[] args) {
        int valorA = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor A :"));
        int valorB = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor B :"));

        int result = valorA + valorB;
        JOptionPane.showMessageDialog(null, "Resultado final: " + result,"Resultado",JOptionPane.INFORMATION_MESSAGE);
    }

}
