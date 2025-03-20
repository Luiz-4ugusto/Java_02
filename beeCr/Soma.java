import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        int A, B, SOMA;  
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();  
        B = sc.nextInt();  
        SOMA = A + B;  

        System.out.printf("SOMA = %d\n", SOMA);

        sc.close();
    }
}
