import java.util.Scanner;

public class Multiplicação {
    public static void main(String[] args) {
        int A, B, PROD;  
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();  
        B = sc.nextInt();  
        PROD = A * B;  

        System.out.printf("PROD = %d\n", PROD);

        sc.close();
    }
}