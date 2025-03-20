import java.util.Scanner;

public class Diferencaa {
    public static void main(String[] args) {
        int A, B, C, D;  
        float DIFERENCA;
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();  
        B = sc.nextInt(); 
        C = sc.nextInt();
        D = sc.nextInt();
        DIFERENCA = (A * B - C * D);

        System.out.printf("DIFERENCA = %.0f\n", DIFERENCA);

        sc.close();
    }
}