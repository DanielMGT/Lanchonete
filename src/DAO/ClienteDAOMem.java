/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Model.ClienteModel;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class ClienteDAOMem implements Cliente_dao{
    
    ArrayList<ClienteModel> clienteList = new ArrayList<ClienteModel>();   
    private static ClienteDAOMem dao;
    
    private ClienteDAOMem(){}
    
    public static ClienteDAOMem getInstance(){
        if(dao ==null){
            dao = new ClienteDAOMem();
        }
        return dao;
    }
   
    @Override
    public void salvar(ClienteModel compra) {
        clienteList.add(compra);
    }

    @Override
    public ArrayList<ClienteModel> recuperar() {
       return clienteList;
    }

    @Override
    public void alterar(ArrayList<ClienteModel> listp) {
        clienteList = listp;     
      }

    

}