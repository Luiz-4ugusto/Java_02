import javax.swing.JOptionPane;

public class ex16 {
    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite num1:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite num2:")); // Corrigido "num1" para "num2"
        System.out.print("Bem-vindo à calculadora genérica! \n");
        System.out.print("Caso queira realizar a soma digite 1, caso queira realizar uma subtração digite 2, caso queira realizar uma multiplicação digite 3 e digite 4 para uma divisão: \n");

        int operacao = Integer.parseInt(JOptionPane.showInputDialog("Digite a operação:")); // Corrigida a redefinição de num1

        if (operacao == 1) {
            int total = num1 + num2;
            System.out.println(total);

        } else if (operacao == 2) {
            int total = num1 - num2;
            System.out.println(total);
        } else if (operacao == 3) {
            int total = num1 * num2;
            System.out.println(total);
        } else if (operacao == 4) {
            if (num2 != 0) { // Correção: evitar divisão por zero
                int total = num1 / num2;
                System.out.println(total);
            } else {
                System.out.println("Erro: Divisão por zero não permitida.");
            }
        }

    }
}
