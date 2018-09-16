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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Túlio
 */

public class TelaCadastroClienteControllerView implements Initializable {

    @FXML
    private Label labelTitulo;

    @FXML
    private Label labelNome;

    @FXML
    private Label labelTelefone;

    @FXML
    private TextField tfNome;

    @FXML
    private TextField tfTelefone;

    @FXML
    private TextField tfEndereco;
    
    @FXML
    private Button btCadastrar;

    @FXML
    private Button btCancelar;
    
    ClienteModel cliente;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void cadastrarCliente(){
        cliente = new ClienteModel();
        
        cliente.setNome(tfNome.getText());
        cliente.setTel(tfTelefone.getText());
        cliente.setEnd(tfEndereco.getText());
        
        ClienteController.cadastrarCliente(cliente);
        
         Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
            dialogoInfo.setTitle("AVISO");
            dialogoInfo.setHeaderText("Cliente cadastrado com sucesso");
            dialogoInfo.showAndWait();
    }
    
    public void cancelar(){
        tfNome.clear();
        tfTelefone.clear();
        tfEndereco.clear();
        
        Lanchonete.trocaTela("telaProduto");
    }
   }
