import javax.swing.JOptionPane;
public class FormaPalavra {
   public static void main (String [] args) {
      String letra1 = JOptionPane.showInputDialog("Digite a primeira letra");
      String letra2 = JOptionPane.showInputDialog("Digite a segunda letra");
      String letra3 = JOptionPane.showInputDialog("Digite a terceira letra");
      String letra4 = JOptionPane.showInputDialog("Digite a quarta letra");
      String letra5 = JOptionPane.showInputDialog("Digite a quinta letra");
      String letra6 = JOptionPane.showInputDialog("Digite a sexta letra");
      String letra7 = JOptionPane.showInputDialog("Digite a setima letra");
      String  letra8 = JOptionPane.showInputDialog("Digite a oitava letra");
      String letra9 = JOptionPane.showInputDialog("Digite a nona letra");
      String letra10 = JOptionPane.showInputDialog("Digite a decima letra");
      
      String resultado = letra1+letra2+letra3+letra4+letra5+letra6+letra7+letra8+letra9+letra10;
      
      JOptionPane.showMessageDialog(null, resultado);
   }
}