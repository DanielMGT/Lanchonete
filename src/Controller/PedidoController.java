/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.PedidoDAOArq;
import Model.PedidoModel;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class PedidoController {
    public ArrayList <PedidoModel> restaurarCliente (){
        ArrayList <PedidoModel> c = new ArrayList();
        PedidoDAOArq dao = new PedidoDAOArq();
        c = dao.recuperar();
        return c;
    }
    
    
    public void alterarPedido(){
        
    }
    public void removerPedido(){
        
    }
    public void efetuarPag(){
        
    }
    public double contaMesa(){
        
        return 1;
    }
}
