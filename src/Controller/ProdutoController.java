/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ProdutoDAOArq;
import Model.ProdutoModel;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class ProdutoController {
    public static ArrayList <ProdutoModel> restaurarCliente (){
        ArrayList <ProdutoModel> pd;
        ProdutoDAOArq dao = new ProdutoDAOArq();
        pd = dao.recuperar();
        return pd;
    }
    public static void cadastrarProduto (){
        
    }
    public static void alterarProduto (Double valor, String f){
        
    }
    public static void removerProduto (String cod){
    
    }
    public static boolean produtoExiste(String cod){
        return true;
    }
}
