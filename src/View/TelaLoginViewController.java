/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.FuncionarioController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author danie
 */
public class TelaLoginViewController implements Initializable {

     @FXML
    private Button btEntrar;

    @FXML
    private TextField tfLogin;

    @FXML
    private Label lbMat;

    @FXML
    private TextField tfMat;

    @FXML
    private Label lbBemV;

    @FXML
    private Label lbLogin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    public void chamaMenuPrincipal(){
        if(FuncionarioController.isNullOrBlank(tfMat.getText())){
            tfLogin.clear();
            tfMat.clear();
            Lanchonete.trocaTela("telaLogin");
        }
        else {
            Lanchonete.trocaTela("menuPrincipal");
        }
    }
    
}
