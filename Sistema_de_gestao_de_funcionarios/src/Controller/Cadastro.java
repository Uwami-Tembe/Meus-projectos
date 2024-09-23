/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.ConnectionDAO;
import Model.Caixa;
import Model.Funcionario;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Cadastro {
    
    public static Connection con=null;
    public static PreparedStatement st=null;
   
    public static void cadastrar(Funcionario f){
    
    }
    
    
    public static void cadastrar(ArrayList<Funcionario>f){
        String sqlQuery = "insert into func_list(nome,idade,salario) values(?,?,?)";
        con= ConnectionDAO.connectDB();
        
        for(Funcionario func:f){
            try {
                st=con.prepareStatement(sqlQuery);
                
                if(func instanceof Model.Caixa){
                    
                    st.setString(1, func.nome);
                    st.setString(2, Integer.toString(func.getIdade()) );
                    st.setString(3, Float.toString(func.getSalario()) );
                    st.execute();
                    st.close();
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ConectionDAO: "+e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Operação de cadastro concluída");
    }
}
