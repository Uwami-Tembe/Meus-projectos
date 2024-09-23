/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2_3;

public class Gerente extends Funcionario {
    
    public float bonus;
    
    public Gerente(String nome, int idade,float salario, float bonus){
        super(nome, idade, salario);
        this.bonus=bonus;
        
    }
    @Override
    public float calcularSalario() {
        salario+= bonus;
        return salario;
    }
}
