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
 * @author danie
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
        Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
        if(!ClienteController.clienteExiste(tfNome.getText())){           
            cliente = new ClienteModel(tfNome.getText(), tfTelefone.getText(),tfEndereco.getText());
            ClienteController.cadastrarCliente(cliente);
        
        dialogoInfo.setTitle("AVISO");
        dialogoInfo.setHeaderText("Cliente cadastrado com sucesso!");
        dialogoInfo.showAndWait();
        }
        else{
            dialogoInfo.setTitle("AVISO");
            dialogoInfo.setHeaderText("Cliente já consta no cadastro!");
            dialogoInfo.showAndWait();
        }
        
        tfNome.clear();
        tfTelefone.clear();
        tfEndereco.clear();
        
        Lanchonete.trocaTela("telaCliente");
    }
    
    public void cancelar(){
        tfNome.clear();
        tfTelefone.clear();
        tfEndereco.clear();
        
        Lanchonete.trocaTela("telaCliente");
        
    }
   }
