import javax.swing.JOptionPane;
public class RaizOuQuadrado {
   public static void main (String [] args) {
      int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
      
      if (numero > 0) {
         double resultado = Math.sqrt(numero);
         JOptionPane.showMessageDialog(null, resultado);
      }
      
      if (numero < 0) {
         double resultado = numero*numero;
         JOptionPane.showMessageDialog(null, resultado);
      }
   }
}