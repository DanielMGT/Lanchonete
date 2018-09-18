/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ClienteModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class ClienteDAOArq implements Cliente_dao {
    ArrayList <ClienteModel> list = new ArrayList();
    private static ClienteDAOArq instance;
    public ClienteDAOArq(){}
    public static ClienteDAOArq getInstance(){
        if (instance == null){
            instance = new ClienteDAOArq();
        }
        return instance;
    }
    @Override
    public void salvar (ClienteModel cliente){
       ClienteDAOArq dao = new ClienteDAOArq();       
        list = dao.recuperar();//recupera a lista do arquivo
        list.add(cliente);
        try{
            FileOutputStream saveFile = new FileOutputStream("CadastroCliente.txt");
            ObjectOutputStream stream = new ObjectOutputStream(saveFile);//instancia o objeto de gravação
            stream.writeObject(list);//salva a lista no arquivo
            stream.close();//fecha objeto de gravação     
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException ex) {
            Logger.getLogger(ClienteDAOArq.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public ArrayList<ClienteModel> recuperar() {
        if(new File("Cadastro.txt").canRead() == true){
            try{
                FileInputStream restFile = new FileInputStream("CadastroCliente.txt");
                ObjectInputStream stream = new ObjectInputStream(restFile);            
                ArrayList<ClienteModel> novo = (ArrayList) stream.readObject();
                stream.close();
                return novo;
            }catch(FileNotFoundException e){
                e.printStackTrace(); 
            }catch (IOException ex) {
                Logger.getLogger(ClienteDAOArq.class.getName()).log(Level.SEVERE, null, ex);
            }catch (ClassNotFoundException ex) {
                Logger.getLogger(ClienteDAOArq.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            try{
                FileOutputStream saveFile = new FileOutputStream("CadastroCliente.txt");
                ObjectOutputStream stream = new ObjectOutputStream(saveFile);//instancia o objeto de gravação
                stream.close();//fecha objeto de gravação
            }catch (FileNotFoundException ex) {
                Logger.getLogger(ClienteDAOArq.class.getName()).log(Level.SEVERE, null, ex);
            }catch (IOException ex) {
                Logger.getLogger(ClienteDAOArq.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
    @Override
    public void alterar(ArrayList<ClienteModel> listp){
        try{
            FileOutputStream saveFile = new FileOutputStream("CadastroCliente.txt");
            ObjectOutputStream stream = new ObjectOutputStream(saveFile);//instancia o objeto de gravação
            stream.writeObject(listp);//salva a lista no arquivo
            stream.close();//fecha objeto de gravação
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException ex) {
            Logger.getLogger(ClienteDAOArq.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
