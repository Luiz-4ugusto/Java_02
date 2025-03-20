import java.util.Scanner;

public class Area_circulo {
    public static void main(String[] args) {
        double N, Raio, Area; 
        Scanner sc = new Scanner(System.in);

        N = 3.14159; 
        Raio = sc.nextDouble();  
        Area = N * Raio * Raio;  

    
        System.out.printf("A=%.4f\n", Area);

        sc.close();
    }
}
