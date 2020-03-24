import javax.swing.JOptionPane;
public class SomaEMostraMaiorQue10 {
   public static void main (String [] args) {
      int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
      int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
      
      int soma = numero1 + numero2;
      
      if (soma>10) {
         JOptionPane.showMessageDialog(null, soma);
      }
   }
}