/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex8.scanner;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Unisul
 */
public class EX8Scanner {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1, num2, num3;
    System.out.print("Digite um número:");
    num1 = Integer.parseInt(sc.nextLine());
    System.out.print("Digite um número:");
    num2 = Integer.parseInt(sc.nextLine());   
    num3 = num1 + num2;
    System.out.print("resultado " + num3);
    

    }
}
