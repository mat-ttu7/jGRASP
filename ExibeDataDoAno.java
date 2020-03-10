import javax.swing.JOptionPane;
public class ExibeDataDoAno {
   public static void main (String [] args) {
      String dia = JOptionPane.showInputDialog("Digite um dia");
      String mes = JOptionPane.showInputDialog("Digite um mes");
      String ano = JOptionPane.showInputDialog("Digite um ano");
      
      String data = dia + "/" + mes + "/" + ano;
      JOptionPane.showMessageDialog(null, data);
   }
}