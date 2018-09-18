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
public class TelaPedidoControllerView implements Initializable {

    @FXML
    private Button btConta;

    @FXML
    private Button btCanPed;

    @FXML
    private Label lbPedido;

    @FXML
    private Button btCadPed;

    @FXML
    private Button btAtlPed;

    @FXML
    private Button btPaga;

    @FXML
    private Button btCancelar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void chamaCadastroPedido(){
        Lanchonete.trocaTela("telaCadastroPedido");
    }
    public void chamaAlteraPedido(){
        Lanchonete.trocaTela("telaAlteraPedido");
    }
    public void chamaCancelaPedido(){
        Lanchonete.trocaTela("telaCancelaPedido");
    }
    public void chamaContaMesa(){
        Lanchonete.trocaTela("telaContaMesa");
    }
    public void chamaEfetuaPag(){
        Lanchonete.trocaTela("telaEfetuaPag");
    }
    public void chamaMenuPrincipal(){
        Lanchonete.trocaTela("menuPrincipal");
    }
}
