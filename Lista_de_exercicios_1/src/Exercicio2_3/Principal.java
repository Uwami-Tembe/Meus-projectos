/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2_3;

public class Principal {
    public static void main(String[]args){
        Vendedor v = new Vendedor("Uawmi", 19, 1200.0f, 0.5f);
        Gerente g = new Gerente("Tembe", 20, 1200.0f, 300.0f);
        
        v.exibirDados();
        g.exibirDados();
    
    }
}
