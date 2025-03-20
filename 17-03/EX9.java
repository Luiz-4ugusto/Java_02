/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex9;
import javax.swing.JOptionPane;

/**
 *
 * @author Unisul
 */
public class EX9 {
    public static void main(String[] args) {
    float Massa, Alt, IMC;
    String input1 = JOptionPane.showInputDialog("Digite um Massa:");
    Massa = Float.parseFloat(input1);
    String input2 = JOptionPane.showInputDialog("Digite um Alt:");
    Alt = Float.parseFloat(input2);
    IMC = Massa / (Alt*Alt);
    JOptionPane.showMessageDialog(null, "Você digitou: " + IMC);
  
    }
}


