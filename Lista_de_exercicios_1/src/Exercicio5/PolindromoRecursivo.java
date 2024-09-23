
package Exercicio5;

import javax.swing.JOptionPane;

public class PolindromoRecursivo {
    
    public static boolean ehPolindromo(String word, int n, int m){
        
        if(n>=m){
            return true;
        }
        else if(word.charAt(n)==word.charAt(m)){
        return ehPolindromo(word, n+1, m-1);
        }
        return false;
    }
    
    
    public static void main(String[]args){
        
        String palavra ="amarrama";
        boolean eh = ehPolindromo(palavra, 0, palavra.length()-1);
        
        if(eh){
            JOptionPane.showMessageDialog(null, "É um polindromo");
        }
        
        else
            JOptionPane.showMessageDialog(null, "Não é um polindromo");
    }
}
