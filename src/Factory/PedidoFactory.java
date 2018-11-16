/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import DAO.PedidoDAOArq;
import DAO.PedidoDAOMem;
import DAO.Pedido_dao;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import static manager.manipConfig.getProp;

/**
 *
 * @author danie
 */
public class PedidoFactory {
    public static Pedido_dao create() throws IOException {
        String tipo;   
        Properties prop = null;
            try {
                prop = getProp();
            } 
            catch (IOException ex) {
                Logger.getLogger(ClienteFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        tipo=prop.getProperty("configClienteDAO");
             
        if      ("0".equals(tipo)){
           return PedidoDAOMem.getInstance();
        }
        else if ("1".equals(tipo)){            
            return PedidoDAOArq.getInstance();
        }
        return null;
    }
}
