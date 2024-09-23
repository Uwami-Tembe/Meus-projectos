
package Exercicio5;

import javax.swing.JOptionPane;


public class ContaDigitosRecursivo {
    public static int contaDigitosRecursivo(int num, int key){
        
        if(num==0){
            return 0;
        }
        
        if (num%10==key){
           return 1+contaDigitosRecursivo(num/10,key);
        }
        else
           return contaDigitosRecursivo(num/10, key);

    }
    
        
    public static void main(String[]args){
        
        int chave=3;
        int numero = 563243763;
        
        int total = contaDigitosRecursivo(numero, chave);
        JOptionPane.showMessageDialog(null, "A quantidade total de números "+ chave + " no numero "+numero+" é "+ total);
        
  
    }
}
