
import javax.swing.JOptionPane;

public class Ex11 {
    public static void main(String[] args) {
    int num1;
    num1 = Integer.parseInt(JOptionPane.showInputDialog("digite um num"));

    if (num1%2 == 0){
        System.out.println("Sim");
    } else {
        System.out.println("nope");
    }
    }
}


