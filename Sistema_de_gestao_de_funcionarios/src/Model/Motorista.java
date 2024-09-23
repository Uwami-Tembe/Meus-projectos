/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Dulce Faife
 */
public class Motorista extends  Funcionario{
    
    private String habilidade= "Eu sei dirigir";
    public Motorista(String nome, int idade, float salario) {
        super(nome, idade, salario);
    }
    
    public String getHabilidade(){
        return habilidade;
    }
 
    @Override
    public float obterBonus() {
        return 0.0f;
    }
    
}
