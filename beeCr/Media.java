import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        double A, B, MEDIA;  
        Scanner sc = new Scanner(System.in);

        A = sc.nextDouble();  
        B = sc.nextDouble();  
        MEDIA = ((A *3.5) + (B * 7.5)) / 11;
        System.out.printf("MEDIA = %.5f\n", MEDIA);

        sc.close();
    }
}