/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmos_de_busca;


import java.util.ArrayList;

public class Algoritmos_de_busca {
    
    public static ArrayList<Integer> buscaLinearIterativa(int[]vet,int element){
       // boolean encontrado = false;
        ArrayList<Integer>positions=new ArrayList<>();
        for(int i =0; i< vet.length; i++){
            if(vet[i]==element){
                positions.add(i);
                //encontrado=true;
            }      
           
        }
       // if (!encontrado){
         return positions;    
        //}  
    }
    
    public static int buscaLinearRecursiva(int[]vet, int element,int index){
       
        
        
        if(index==vet.length){
           return -1;   
        }
        if(vet[index]==element){
            return index;
        }
        else{   
          
            return buscaLinearRecursiva(vet, element,index+1);
        }
    }
    
    public static void buscaBinariaRecursiva(int []vet, int element, int ini,int end){
        
        if(ini>end){
            System.out.println("Elemento não encontrado");
        }
        int mid = ini+(end-ini)/2;
        if(vet[mid]==element){
                  System.out.println("Elemento "+element+" encontrado na posição: "+" "+mid);
           }  
        else if(element<vet[mid]){
            buscaBinariaRecursiva(vet,element,ini,mid-1);
        }
        else{
            buscaBinariaRecursiva(vet,element,mid+1,end);
        }
    }
    
    public static void buscaBinariaIterativa(int vet[], int element){
        int ini =0;
        int end = vet.length-1;
        
        while(ini<=end){
            int meio = ini+(end-ini)/2;
            
            if( element== vet[meio]){
                 System.out.println("Elemento "+element+" encontrado na posição: "+" "+meio);
                 return;
            }
            
            if(vet[meio]>element){
                end=meio-1;
            }
            
            if(vet[meio]< element){
                ini= meio+1;
            }
            
            else
              System.out.println("Elemento não encontrado");     
        }
    }

    public static void main(String[] args) {
       
        int valor;
        int[]vetorTeste = {1,3,5,5,6,5};
        ArrayList<Integer> valores = new ArrayList<>();
        //buscaLinear(vetorTeste, 6);
        valores=buscaLinearIterativa(vetorTeste,5 );
        
        System.err.println(valores);
    }
    
}
