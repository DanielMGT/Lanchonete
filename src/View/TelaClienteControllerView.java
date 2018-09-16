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
 * @author Túlio
 */
public class TelaClienteControllerView implements Initializable {

    
    @FXML
    private Label labelCliente;

    @FXML
    private Button botaoCadCliente;

    @FXML
    private Button botaoAltCliente;

    @FXML
    private Button botaoRemCliente;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void chamaCadastroCliente(){
        Lanchonete.trocaTela("cadastroCliente");
    }
    
    public void chamaAlteraCliente(){
        Lanchonete.trocaTela("AlterarCliente");
    }
    
    public void chamaRemoveCliente(){
        Lanchonete.trocaTela("RemoverCliente");
    }
    
}
