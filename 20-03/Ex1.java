
import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {
    int num1;
    num1 = Integer.parseInt(JOptionPane.showInputDialog("digite um num"));

    if (num1 > 10){
        int valor = num1;
        num1 = num1/2;
        System.out.println("O valor é " + valor + " e é maior que 10 e sua metade é: " + num1);
    } else{
        int valor = num1;
        num1 = num1*2;
        System.out.println("O valor é " + valor + " menor que 10 e seu sobro é: " + num1);

    }
  
    }
}


