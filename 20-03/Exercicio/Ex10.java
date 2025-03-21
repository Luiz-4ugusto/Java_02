
import javax.swing.JOptionPane;

public class Ex10 {
    public static void main(String[] args) {
    int num1, num2, total;
    num1 = Integer.parseInt(JOptionPane.showInputDialog("digite um num"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("digite um num"));
    total = num1+num2;
    if (total > 10){
        System.out.println(total);
    } else{
        
        System.out.println("nope");

    }
  
    }
}


