/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Dulce Faife
 */
public class Main {
    public static ArrayList<Funcionario>arr;
    public static void main(String[] args) {
        Garcon g1 = new Garcon("Uwami", 19, 1200, 20);
        Garcon g2 = new Garcon("Almeida", 50, 30000, 200);
        Caixa c1 =new Caixa ("Dulce", 51, 1200, 500);
        Caixa c2 =new Caixa ("André", 19, 30000, 500);
        arr = new ArrayList<>();
        arr.add(g1);
        arr.add(g2);
        arr.add(c1);
        arr.add(c2);
        
        System.out.println(g1.obterBonus());
        System.out.println(c1.obterBonus());
        
        for(Funcionario f:arr){
            f.imprimir();
        }
        
        System.out.println();
        System.out.println();
        
        for(Funcionario f:arr){
            if(f instanceof Caixa){
                f.imprimir();
            }
        }
    }
}
