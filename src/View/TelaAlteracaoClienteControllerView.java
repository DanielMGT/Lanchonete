/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ClienteController;
import Model.ClienteModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Túlio
 */
public class TelaAlteracaoClienteControllerView implements Initializable {

    /**
     * Initializes the controller class.
     */
    
      @FXML
    private Label lbTitulo;

    @FXML
    private Label lbTelefone;

    @FXML
    private Label lbEndereco;

    @FXML
    private TextField tfTelefone;

    @FXML
    private TextField tfEndereco;

    @FXML
    private Button btAlterar;

    @FXML
    private Button btCancelar;
    
    @FXML
    private Label lbNome;

    @FXML
    private TextField tfNome;
    
    ClienteModel cliente;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void alterarCliente(){
        Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
        if(ClienteController.clienteExiste(tfNome.getText())){
            ClienteController.alterarDados(tfEndereco.getText(), tfTelefone.getText());
            dialogoInfo.setTitle("AVISO");
            dialogoInfo.setHeaderText("Cliente alterado com sucesso!");
            dialogoInfo.showAndWait();
        }
        else{
            
            dialogoInfo.setTitle("AVISO");
            dialogoInfo.setHeaderText("Cliente não cadastrado!");
            dialogoInfo.showAndWait();
        }
        
        tfNome.clear();
        tfEndereco.clear();
        tfTelefone.clear();
        Lanchonete.trocaTela("telaCliente");
    }
    
    public void cancelar(){
        tfNome.clear();
        tfEndereco.clear();
        tfTelefone.clear();
        Lanchonete.trocaTela("telaCliente");        
    }
    
}
