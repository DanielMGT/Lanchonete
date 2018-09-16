/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author danie
 */
public class menuPrincipalControllerView implements Initializable {
    
  
    @FXML
    private Label lbmenuPrincipal;

    @FXML
    private Button btPedido;

    @FXML
    private Button btCliente;

    @FXML
    private Button btProduto;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    public void chamaPedido(){
        Lanchonete.trocaTela("telaPedido");
    }
    
    public void chamaCliente(){
        Lanchonete.trocaTela("telaCliente");
    }
    
    public void chamaProduto(){
        Lanchonete.trocaTela("telaProduto");
    }
    
}