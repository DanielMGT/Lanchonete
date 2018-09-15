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
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class ProdutoDAOArq implements Produto_dao {
    ArrayList <ProdutoModel> list = new ArrayList();
    private static ProdutoDAOArq instance;
    public ProdutoDAOArq (){}
    public static ProdutoDAOArq getInstance(){
        if (instance == null){
            instance = new ProdutoDAOArq();
        }
        return instance;
    }
    public void salvar(ProdutoModel produto){
        ProdutoDAOArq dao = new ProdutoDAOArq();
        list = dao.recuperar();
        list.add(produto);
        try {
            FileOutputStream saveFile = new FileOutputStream("Produto.txt");
            ObjectOutputStream stream = new ObjectOutputStream(saveFile);
            stream.writeObject(list);
            stream.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException ex) {
            Logger.getLogger(ProdutoDAOArq.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public ArrayList<ProdutoModel> recuperar(){//Restaura lista
        if(new File("Produtos.txt").canRead() == true){
            try{
                FileInputStream restFile = new FileInputStream("Produtos.txt");
                ObjectInputStream stream = new ObjectInputStream(restFile);            
                ArrayList<ProdutoModel> novo = (ArrayList) stream.readObject();
                stream.close();
                return novo;
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }catch (IOException ex) {
                Logger.getLogger(ProdutoDAOArq.class.getName()).log(Level.SEVERE, null, ex);
            }catch (ClassNotFoundException ex) {
                Logger.getLogger(ProdutoDAOArq.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            try{
            FileOutputStream saveFile = new FileOutputStream("Produtos.txt");
            ObjectOutputStream stream = new ObjectOutputStream(saveFile);//instancia o objeto de gravação
            stream.close();//fecha objeto de gravação
            }catch (FileNotFoundException ex) {
                Logger.getLogger(ProdutoDAOArq.class.getName()).log(Level.SEVERE, null, ex);
            }catch (IOException ex) {
                Logger.getLogger(ProdutoDAOArq.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
     public void alterar(ArrayList<ProdutoModel> listp ){
        try{
            FileOutputStream saveFile = new FileOutputStream("Produtos.txt");
            ObjectOutputStream stream = new ObjectOutputStream(saveFile);//instancia o objeto de gravação
            stream.writeObject(listp);//salva a lista no arquivo
            stream.close();//fecha objeto de gravação
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException ex) {
            Logger.getLogger(ProdutoDAOArq.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

