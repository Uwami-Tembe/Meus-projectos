/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


public class Método_recursivo {
    
    public static void imprimePares(int n){
        if(n<0){
            return;
        }
        else if(n%2!=0){
            System.out.print(n+" ");
            imprimePares(n-1);
        }
        else
            imprimePares(n-1);
    }
    
    
    public static void main(String[]args){
    
        imprimePares(20);
    
    }
}
