/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2_3;

/**
 *
 * @author Dulce Faife
 */
public class Vendedor extends Funcionario{
    
    private float comissao;
    public Vendedor(String nome, int idade,float salrio, float comissao) {
        super(nome, idade,salrio);
        this.comissao=comissao;
    }
    public float getComissao(){
        return comissao;
    }

    @Override
    public float calcularSalario() {
        salario+= comissao*salario;
        return salario;
    }
    
    
    
}
