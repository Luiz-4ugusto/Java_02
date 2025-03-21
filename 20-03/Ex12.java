
import javax.swing.JOptionPane;

public class Ex12 {
    public static void main(String[] args) {
    int num1, num2;
    num1 = Integer.parseInt(JOptionPane.showInputDialog("digite um num"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("digite um num"));

    if (num1>num2){
        System.out.println("numero 1 é maior " + num1);
    } else if (num1<num2){
        
        System.out.println("numero 2 é maior " + num2);

    } else{
        System.out.println("iguais");
    }
  
    }
}


