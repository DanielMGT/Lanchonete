/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ProdutoModel;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
    public interface Item_dao {
    void salvar(ProdutoModel item);
    ArrayList<ProdutoModel> recuperar();
    void alterar(ArrayList<ProdutoModel> listp);
    }
