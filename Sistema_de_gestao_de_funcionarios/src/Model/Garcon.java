/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Dulce Faife
 */
public class Garcon extends  Funcionario{
    
    float gorjeta;
    public Garcon(String nome, int idade, float salario,float gorjeta) {
        super(nome, idade, salario);
        this.gorjeta = gorjeta;
    }

    @Override
    public void imprimir() {
        super.imprimir(); 
        System.out.println(" "+gorjeta);
        
        
    }
    
        @Override
    public float obterBonus() {
        return super.getSalario()*0.20f;
    }
    
}
