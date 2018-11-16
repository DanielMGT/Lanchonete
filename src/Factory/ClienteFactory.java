/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import DAO.ClienteDAOArq;
import DAO.ClienteDAOMem;
import DAO.Cliente_dao;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import static manager.manipConfig.getProp;

/**
 *
 * @author danie
 */
public class ClienteFactory {
     public static Cliente_dao create() /*throws IOException*/ {
        String tipo;   
        Properties prop = null;
            try {
                prop = getProp();
            } 
            catch (IOException ex) {
                Logger.getLogger(ClienteFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        tipo=prop.getProperty("configClienteDAO");
             
        if ("0".equals(tipo)){
           return ClienteDAOMem.getInstance();
        }
        else if ("1".equals(tipo)){            
            return ClienteDAOArq.getInstance();
        }
        return null;
    }

}
