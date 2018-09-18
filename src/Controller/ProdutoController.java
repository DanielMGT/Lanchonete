/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.ProdutoController.pd;
import DAO.ProdutoDAOArq;
import Model.ProdutoModel;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class ProdutoController {
       static ArrayList <ProdutoModel> pd;
       static ProdutoDAOArq dao = new ProdutoDAOArq();
        
    public static void cadastrarProduto (ProdutoModel produto){
        pd.add(produto);
    }
    public static void alterarProduto (Double valor, String f){
        
    }
    public static void removerProduto (double cod){
    
    }
    public static boolean produtoExiste(double cod){
        pd = dao.recuperar();
        ProdutoModel aux;
        int i;
        for(i = 0; i < pd.size(); i++){
            aux = pd.get(i);
            if(aux.getCodigo() == cod){
                return true;
            }
        }
        return false;
        
    }
}
