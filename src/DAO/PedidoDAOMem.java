/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import Model.Pedido;
/**
 *
 * @author danie
 */
public class PedidoDAOMem implements Pedido_dao {
    ArrayList<Pedido> pedidoList = new ArrayList<Pedido>();   
    private static PedidoDAOMem instance;
    private PedidoDAOMem(){}
    
    public static PedidoDAOMem getInstance(){
        if(instance ==null){
            instance = new PedidoDAOMem();
        }
        return instance;
    }
   
    @Override
    public void salvar(Pedido compra) {
        pedidoList.add(compra);
    }

    public ArrayList<Pedido> recuperar() {
       return pedidoList;
    }

    public void alterar(ArrayList<Pedido> listp) {
        pedidoList = listp;     
      }
}
