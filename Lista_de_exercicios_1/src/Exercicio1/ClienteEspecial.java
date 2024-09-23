/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

public class ClienteEspecial extends Cliente{
  
    public ClienteEspecial(String titular, String numConta, float saldo) {
         
        super(titular, numConta, saldo);  
        super.id="CLE";
        super.taxa=0.001f;
    }
    
}
