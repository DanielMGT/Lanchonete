/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ItemDAOArq;
import Model.ItemModel;
import Model.ProdutoModel;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class ItemController {
    private ArrayList<ProdutoModel> itemList = new ArrayList();
    private ArrayList<ProdutoModel> itemSpecificList = new ArrayList();  
    public ArrayList<ProdutoModel> recuperarLista(){
        ItemDAOArq dao = new ItemDAOArq();
        itemList = dao.recuperar();
        return itemList;
    }
    public void addItens(ProdutoModel item){
        itemList.add(item);
    }
    
}
