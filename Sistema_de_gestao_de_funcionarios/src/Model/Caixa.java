/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Dulce Faife
 */
public class Caixa extends Funcionario {
    
    float subsidio;
    public Caixa(String nome, int idade, float salario, float subsidio) {
        super(nome, idade, salario);
        this.subsidio = subsidio;
    }
    
        @Override
    public void imprimir() {
        super.imprimir(); 
        System.out.println(" "+subsidio);
        
    }

    @Override
    public float obterBonus() {
        return super.getSalario()*0.35f;
    }
}
