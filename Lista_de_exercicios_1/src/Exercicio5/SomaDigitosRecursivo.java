/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio5;

import javax.swing.JOptionPane;

public class SomaDigitosRecursivo {

    public static int somaDigitosRecursivo(int num){
        if(num==0){
          return 0;
        }
        else
           return num%10+somaDigitosRecursivo(num/10);

    }
    public static void main(String[]argas){
        int numero = 45;
        int soma = somaDigitosRecursivo(numero);
        
        JOptionPane.showMessageDialog(null, "A soma dos digitos do numero "+numero+" é: "+soma);
    
    
    }
    
}
