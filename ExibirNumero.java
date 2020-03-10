import javax.swing.JOptionPane;
public class ExibirNumero {
   public static void main (String [] args) {
      int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
      JOptionPane.showMessageDialog(null, "O valor do número digitado é: " + numero + ".");
   }
}