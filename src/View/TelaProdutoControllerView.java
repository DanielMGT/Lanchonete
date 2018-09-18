/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.ProdutoModel;
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
public class TelaProdutoControllerView implements Initializable {
    
    @FXML
    private Button botaoAltProdutos;

    @FXML
    private Button botaoRemProdutos;

    @FXML
    private Label labelprodutos;

    @FXML
    private Button botaoCadProdutos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    public void chamaCadastroProduto(){
        Lanchonete.trocaTela("telaCadastroProduto");
    } 
    public void chamaAlteraProduto(){
        Lanchonete.trocaTela("telaAlterarProduto");
    }  
    public void chamaRemoveProduto(){
        Lanchonete.trocaTela("telaRemocaoProduto");
    } 
}
