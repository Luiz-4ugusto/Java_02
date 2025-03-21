import javax.swing.JOptionPane;
import java.time.LocalDate;


public class Ex14 {
    public static void main(String[] args) {
    int ano_atual, Nascimento, idade;
    ano_atual =  LocalDate.now().getYear();

    Nascimento = Integer.parseInt(JOptionPane.showInputDialog("digite um num"));
    idade = ano_atual - Nascimento;

    if (Nascimento > ano_atual){
        System.out.println("Erro");
    } else{
        
        System.out.println(idade);

    }
  
    }
}


