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
public class PedidoController {
   
        static ArrayList <ProdutoModel> c;
        static ProdutoDAOArq dao = new ProdutoDAOArq();
        
    public static void cadastrarCliente (ProdutoModel produto){
        c.add(produto);
    } 
    public static void alterarPedido(ProdutoModel produto){
        c = dao.recuperar();
        ProdutoModel aux;
        int i = 0;
        while(true){
            aux = c.get(i);
            if(aux.getCodigo() == produto.getCodigo()){
                c.set(i, produto) ;
                return;
            }
            i++;
        }
    }
    public static void removerPedido(String nome){
        c = dao.recuperar();
        ProdutoModel aux;
        int i = 0;
        while(true){
           aux = c.get(i);
           if(aux.getDesc().equalsIgnoreCase(nome)){
               c.remove(i);
           }
        }
    }
    public void efetuarPag(){
        
    }
    public double contaMesa(){
        
        return 1;
    }
    public static boolean produtoExiste(double cod){
        c = dao.recuperar();
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
