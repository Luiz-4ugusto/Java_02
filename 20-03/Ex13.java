
import javax.swing.JOptionPane;
//A prefeitura de Florianópolis abriu uma linha de crédito para os funcionários
//estatutários. O valor máximo da prestação não poderá ultrapassar 30% do
//salário bruto. Faça um algoritmo que permita entrar com o salário bruto e o
//valor da prestação e informar se o empréstimo pode ou não ser concedido.
public class Ex13 {
    public static void main(String[] args) {
    float Salario_bruto, prestacao, trinta_porc;
    Salario_bruto = Float.parseFloat(JOptionPane.showInputDialog("digite um num"));
    prestacao = Float.parseFloat(JOptionPane.showInputDialog("digite um num"));
    trinta_porc = Salario_bruto * 0.3f;

    if (prestacao > trinta_porc){
        System.out.println("ultapassa");
    } else{
        
        System.out.println("Permitido");

    }
  
    }
}


