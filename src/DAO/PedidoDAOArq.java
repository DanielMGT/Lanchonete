/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Pedido;
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
public class PedidoDAOArq implements Pedido_dao {
    ArrayList <Pedido> list = new ArrayList();
    private static PedidoDAOArq instance;
    public PedidoDAOArq(){}
    public static PedidoDAOArq getInstance(){
        if (instance == null){
            instance = new PedidoDAOArq();
        }
        return instance;
    }
    public void salvar (Pedido pedido){
        PedidoDAOArq dao = new PedidoDAOArq();       
        list = dao.recuperar();//recupera a lista do arquivo
        list.add(pedido);
        try{
            FileOutputStream saveFile = new FileOutputStream("PedidoCliente.txt");
            ObjectOutputStream stream = new ObjectOutputStream(saveFile);//instancia o objeto de gravação
            stream.writeObject(list);//salva a lista no arquivo
            stream.close();//fecha objeto de gravação     
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException ex) {
            Logger.getLogger(ClienteDAOArq.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void alterar(ArrayList<Pedido> listp ){
        try{
            FileOutputStream saveFile = new FileOutputStream("PedidoCliente.txt");
            ObjectOutputStream stream = new ObjectOutputStream(saveFile);//instancia o objeto de gravação
            stream.writeObject(listp);//salva a lista no arquivo
            stream.close();//fecha objeto de gravação
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException ex) {
            Logger.getLogger(ClienteDAOArq.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Pedido> recuperar() {
        if(new File("Pedido.txt").canRead() == true){
            try{
                FileInputStream restFile = new FileInputStream("PedidoCliente.txt");
                ObjectInputStream stream = new ObjectInputStream(restFile);            
                ArrayList<Pedido> novo = (ArrayList) stream.readObject();
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
}
