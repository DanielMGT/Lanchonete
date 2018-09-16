/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import DAO.ClienteDAOArq;
import Model.ClienteModel;
import java.util.ArrayList;
/**
 *
 * @author danie
 */
public class ClienteController {
    public static ArrayList <ClienteModel> restaurarCliente (){
        ArrayList <ClienteModel> cl = new ArrayList();
        ClienteDAOArq dao = new ClienteDAOArq();
        cl = dao.recuperar();
        return cl;
    }
    public static void cadastrarCliente (ClienteModel cliente){
        
    }
    public static void alterarDados (String endereco, String telefone){
        
    }
   
    public static void removerCliente (String nome){
        
    }
    
    public static boolean clienteExiste(String nome){
        return true;
    }
    
}
