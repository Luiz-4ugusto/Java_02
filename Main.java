import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Salario, Vendas, total;  
        String nome;
        Scanner sc = new Scanner(System.in);
        nome = sc.next();

        Salario = sc.nextDouble();  
        Vendas = sc.nextDouble();

        total = Salario + (Vendas*0.15);
        

     

        System.out.printf("TOTAL = R$ %.2f\n", total);

        sc.close();
    }
}