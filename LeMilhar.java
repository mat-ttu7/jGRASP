import javax.swing.JOptionPane;
public class LeMilhar {
   public static void main (String [] args) {
      char milhar = JOptionPane.showInputDialog("Digite um numero para o milhar").charAt(0);
      char centena = JOptionPane.showInputDialog("Digite um numero para a centena").charAt(0);
      char dezena = JOptionPane.showInputDialog("Digite um numero para a dezena").charAt(0);
      char unidade = JOptionPane.showInputDialog("Digite um numero para a unidade").charAt(0);
      
      String resultado = milhar + "" + centena + "" + dezena + "" + unidade;
      
      JOptionPane.showMessageDialog(null, resultado);
   }
}