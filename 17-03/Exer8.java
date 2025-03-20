/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Unisul
 */
public class Exer8 {
    
    public static void main(String[] args) {
    int num1, num2, num3;
    String input1 = JOptionPane.showInputDialog("Digite um número:");
    num1 = Integer.parseInt(input1);
    String input2 = JOptionPane.showInputDialog("Digite um número:");
    num2 = Integer.parseInt(input2);
    num3 = num1 + num2;
    JOptionPane.showMessageDialog(null, "Você digitou: " + num3);

    

    
}}
