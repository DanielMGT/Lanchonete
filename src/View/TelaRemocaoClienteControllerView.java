/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ClienteController;
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
public class TelaRemocaoClienteControllerView implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Label lbTitulo;

    @FXML
    private Label lbNome;

    @FXML
    private TextField tfNome;

    @FXML
    private Button btRemover;

    @FXML
    private Button btCancelar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void removerCliente(){
        Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
        
        if(ClienteController.clienteExiste(tfNome.getText())){
            ClienteController.removerCliente(tfNome.getText());
            dialogoInfo.setTitle("AVISO");
            dialogoInfo.setHeaderText("Cliente removido com sucesso!");
            dialogoInfo.showAndWait();
        }
        else{
            dialogoInfo.setTitle("AVISO");
            dialogoInfo.setHeaderText("Cliente não cadastrado!");
            dialogoInfo.showAndWait();
        }
        
        tfNome.clear();
        Lanchonete.trocaTela("telaCliente");
    }
    
    public void cancelar(){
        tfNome.clear();
        Lanchonete.trocaTela("telaCliente");
    }
}
