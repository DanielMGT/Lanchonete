/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ProdutoModel;
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
public class ItemDAOArq implements Item_dao{
    ArrayList<ProdutoModel> list = new ArrayList();
    private static ItemDAOArq instance;
    public ItemDAOArq(){}
    public static ItemDAOArq getInstace(){
        if(instance ==null){
            instance = new ItemDAOArq();
        }
        return instance;
    }
    public void salvar(ProdutoModel item){//Inseri um novo funcionario na lista
        ItemDAOArq dao = new ItemDAOArq();
        list = dao.recuperar();//recupera a lista do arquivo
        list.add(item);  
        try{
            FileOutputStream saveFile = new FileOutputStream("CadastroItem.txt");
            ObjectOutputStream stream = new ObjectOutputStream(saveFile);//instancia o objeto de gravação
            stream.writeObject(list);//salva a lista no arquivo
            stream.close();//fecha objeto de gravação      
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException ex) {
            Logger.getLogger(ItemDAOArq.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    public ArrayList<ProdutoModel> recuperar(){//Restaura lista
        if(new File("CadastroItem.txt").canRead() == true){
            try{
                FileInputStream restFile = new FileInputStream("CadastroItem.txt");
                ObjectInputStream stream = new ObjectInputStream(restFile);            
                ArrayList<ProdutoModel> novo = (ArrayList) stream.readObject();
                stream.close();
                return novo;
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }catch (IOException ex) {
                Logger.getLogger(ItemDAOArq.class.getName()).log(Level.SEVERE, null, ex);
            }catch (ClassNotFoundException ex) {
                Logger.getLogger(ItemDAOArq.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
        else{
            try{
            FileOutputStream saveFile = new FileOutputStream("CadastroItem.txt");
            ObjectOutputStream stream = new ObjectOutputStream(saveFile);//instancia o objeto de gravação
            stream.close();//fecha objeto de gravação
            }catch (FileNotFoundException ex) {
                Logger.getLogger(ItemDAOArq.class.getName()).log(Level.SEVERE, null, ex);
            }catch (IOException ex) {
                Logger.getLogger(ItemDAOArq.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
    public void alterar(ArrayList<ProdutoModel> listp ){
        try{
            FileOutputStream saveFile = new FileOutputStream("CadastroItem.txt");
            ObjectOutputStream stream = new ObjectOutputStream(saveFile);//instancia o objeto de gravação
            stream.writeObject(listp);//salva a lista no arquivo
            stream.close();//fecha objeto de gravação
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException ex) {
            Logger.getLogger(ItemDAOArq.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
