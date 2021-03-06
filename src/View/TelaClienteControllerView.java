/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author danie
 */
public class TelaClienteControllerView implements Initializable {

    
    @FXML
    private Button btAltCliente;

    @FXML
    private Label lbCliente;

    @FXML
    private Button btCadCliente;

    @FXML
    private Button btRemCliente;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // o view pega
    }
    
    public void chamaCadastroCliente(){
        Lanchonete.trocaTela("telaCadastroCliente");
    }
    
    public void chamaAlteraCliente(){
        Lanchonete.trocaTela("telaAlteracaoCliente");
    }
    
    public void chamaRemoveCliente(){
        Lanchonete.trocaTela("telaRemocaoCliente");
    }
    
    public void chamaMenu(){
        Lanchonete.trocaTela("menuPrincipal");
    }
    
}
