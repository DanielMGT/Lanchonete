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
    
    static ClienteDAOArq dao = new ClienteDAOArq();
    static ArrayList<ClienteModel> clientes;
    
    public static void cadastrarCliente (ClienteModel cliente){
        clientes.add(cliente);
    }
    public static void alterarDados (ClienteModel cliente){
        clientes = dao.recuperar();
        ClienteModel aux;
        int i = 0;
        while(true){
            aux = clientes.get(i);
            if(aux.getNome().equals(cliente.getNome())){
                clientes.set(i, cliente);
                return;
            }
            i++;
        }
    }
   
    public static void removerCliente (String nome){
        clientes = dao.recuperar();
        ClienteModel aux;
        int i = 0;
        while(true){
           aux = clientes.get(i);
           if(aux.getNome() == nome){
               clientes.remove(i);
           }
        }
    }
    
    public static boolean clienteExiste(String nome){
        clientes = dao.recuperar();
        ClienteModel aux;
        int i;
        for(i = 0; i < clientes.size(); i++){
            aux = clientes.get(i);
            if(aux.getNome() == nome){
                return true;
            }
        }
        return false;
    }
    
}
