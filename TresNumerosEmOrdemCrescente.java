import javax.swing.JOptionPane;
public class TresNumerosEmOrdemCrescente {
   public static void main (String [] args) {
      int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
      int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
      int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
      
      if (numero1 > numero2 && numero2 > numero3) {
         JOptionPane.showMessageDialog(null, numero3 + " " + numero2 + " " + numero1);
      }
      
      else if (numero1 > numero3 && numero3 > numero2) {
         JOptionPane.showMessageDialog(null, numero2 + " " + numero3 + " " + numero1);
      }
      
      else if (numero2 > numero1 && numero1 > numero3) {
         JOptionPane.showMessageDialog(null, numero3 + " " + numero1 + " " + numero2);
      }
      
      else if (numero2 > numero3 && numero3 > numero1) {
         JOptionPane.showMessageDialog(null, numero1 + " " + numero3 + " " + numero2);
      }
      
      else if (numero3 > numero1 && numero1 > numero2) {
         JOptionPane.showMessageDialog(null, numero2 + " " + numero1 + " " + numero3);
      }
      
      else if (numero3 > numero2 && numero2 > numero1) {
         JOptionPane.showMessageDialog(null, numero1 + " " + numero2 + " " + numero3);
      }
   }
}