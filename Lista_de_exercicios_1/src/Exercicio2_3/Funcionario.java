
package Exercicio2_3;

import javax.swing.JOptionPane;

public class Funcionario {
    public String nome;
    public int idade;
    float salario;
    
    public Funcionario(String nome, int idade,float salario){
        this.nome=nome;
        this.idade=idade;
        this.salario=salario;
    }
    
    public float calcularSalario(){
        return salario;
    }
   
    public void exibirDados(){
        
        JOptionPane.showMessageDialog(null, nome+ " "+idade+" anos "+calcularSalario());
    }

}
