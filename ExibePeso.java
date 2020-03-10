import javax.swing.JOptionPane;
public class ExibePeso {
   public static void main (String [] args) {
      String peso = JOptionPane.showInputDialog("Digite seu peso");
      JOptionPane.showMessageDialog(null, "O peso informado foi " + peso + " kg.");
   }
}