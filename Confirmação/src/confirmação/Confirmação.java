
package confirmação;
import javax.swing.JOptionPane;
public class Confirmação {
    public static void main(String[] args) {
        boolean continuar = true;
        while(continuar){
                String num1Str = JOptionPane.showInputDialog("Digite o primeiro número: ");
                String num2Str = JOptionPane.showInputDialog("Digite o segundo número: ");
            
                double num1 = Double.parseDouble(num1Str);
                double num2 = Double.parseDouble(num2Str);
                
                double resultado = num1 + num2;
                
                    //Exibir resultado
                JOptionPane.showMessageDialog(null, "Resultado da soma: " + resultado);
            
                //deseja continuar
                 int resposta = JOptionPane.showConfirmDialog(
                 null,
                         "Deseja realizar outra soma?",
                         "Confirmar",
                         JOptionPane.YES_NO_OPTION);
                 // Se clicar em Nãi o programa encerra
                 if (resposta == JOptionPane.NO_OPTION){
                     continuar = false;
                     JOptionPane.showConfirmDialog(null, "Programa encerrado.");
                 }
        }
    }
    
}
