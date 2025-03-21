import javax.swing.JOptionPane;
import java.time.LocalDate;


public class Ex15 {
    public static void main(String[] args) {
    int ano_atual, Nascimento, idade;
    String nome;
    nome = JOptionPane.showInputDialog("Digite nome:");
    ano_atual =  LocalDate.now().getYear();

    Nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite ano nascimento:"));
    idade = ano_atual - Nascimento;

    if (idade >= 15 && idade <=25){
        System.out.println("aceito " + nome);
    } else{
        
        System.out.println("negado");

    }
  
    }
}


