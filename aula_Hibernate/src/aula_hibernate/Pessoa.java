package aula_hibernate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Pessoa {
    @Id
    @GeneratedValue
    int codigo;
   
    String nome;
    int idade;
    
    public int getIdade(){
        return idade;
    }
    
    public String getNome(){
        return  nome;
    }
}
