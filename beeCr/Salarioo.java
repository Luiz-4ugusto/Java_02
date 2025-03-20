import java.util.Scanner;

public class Salarioo {
    public static void main(String[] args) {
        int NUMBER;
        double SALARY, Horas_t, Horas_s;  
        Scanner sc = new Scanner(System.in);
        

        NUMBER = sc.nextInt();
        Horas_t = sc.nextDouble();  
        Horas_s = sc.nextDouble();
        

        SALARY = Horas_t * Horas_s;
        

        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f\n", SALARY);

        sc.close();
    }
}
