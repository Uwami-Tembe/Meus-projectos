/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

import javax.swing.JOptionPane;


public class Cliente {
    
   protected String id;
    public String titular;
    private String numConta;
    private float saldo;
    protected float taxa;
    boolean status;
    
    public Cliente(String titular,String numConta, float saldo){
        id="CLN";
        taxa= 0.005f;
        this.titular=titular;
        this.numConta= id+numConta;
        this.saldo= saldo;
        this.status = true;
     
    }
    
    public void setSaldo(float novoSaldo){
        saldo = novoSaldo;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public void depositar(float valor){
        saldo += valor;
    }
    
    public void levantar (float valor){
        saldo -= valor+(taxa*valor);
    }
    public void imprimir_numConta(){
        JOptionPane.showMessageDialog(null, "Numero de conta:" + numConta);
    }
    
    public void verificarSaldo(){
        float saldoActual;
        saldoActual = getSaldo();
        JOptionPane.showMessageDialog(null, "Saldo actual: "+saldoActual);
    
    }
}
