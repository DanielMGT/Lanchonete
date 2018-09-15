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
    public interface Cliente_dao {
    void salvar(ClienteModel cliente);
    ArrayList<ClienteModel> recuperar();
    void alterar(ArrayList<ClienteModel> listp);
    }
