/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author Dulce Faife
 */
public class Lista_de_exercicios_1 {
    
    public static void main(String[] args) {
       Cliente cli_1 = new Cliente("Uwami","123456FF",0.0f);
       ClienteEspecial cli_2 = new ClienteEspecial("Tembe","654321FF",1200f);
      
       cli_1.depositar(1200);
       cli_1.levantar(500);
       cli_1.verificarSaldo();
       cli_1.imprimir_numConta();
       
       cli_2.levantar(500);
       cli_2.verificarSaldo();
       cli_2.imprimir_numConta();
       
    }
    
}
