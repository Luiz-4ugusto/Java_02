import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bem-vindo à calculadora genérica! \n");
        System.out.print("Caso queira realizar a soma digite 1, caso queira realizar uma subtração digite 2, caso queira realizar uma multiplicação digite 3 e digite 4 para uma divisão: \n");
        
        int num1 = Integer.parseInt(sc.nextLine());

        if (num1 == 1) {
            System.out.print(1);
            System.out.print("Bem-vindo à calculadora genérica! \n");

            int num2 = Integer.parseInt(sc.nextLine());
            int[] Array = new int[num2]; 
            System.out.println(Array);

        } else if (num1 == 2) {
            System.out.print(2);
        } else if (num1 == 3) {
            System.out.print(3);
        } else if (num1 == 4) { 
            System.out.print(4);
        }

        sc.close(); 
    }
}
