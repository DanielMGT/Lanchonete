/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ProdutoController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author danie
 */
public class TelaRemocaoProdutoControllerView implements Initializable{

     @FXML
    private TextField tfCodigo;

    @FXML
    private Label lbRemProd;

    @FXML
    private Button btRemover;

    @FXML
    private Label lbCodigo;

    @FXML
    private Button btCancelar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    public void removeProd(){
        Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
        String cd = tfCodigo.getText();
        if (ProdutoController.produtoExiste(Double.parseDouble(cd))){
            ProdutoController.removerProduto(Double.parseDouble(cd));
            dialogoInfo.setTitle("AVISO");
            dialogoInfo.setHeaderText("Produto removido com sucesso!");
            dialogoInfo.showAndWait();
        }
        else {
            dialogoInfo.setTitle("AVISO");
            dialogoInfo.setHeaderText("Produto não cadastrado!");
            dialogoInfo.showAndWait();
        }
        tfCodigo.clear();
        Lanchonete.trocaTela("telaProduto");
    }
    public void cancelar(){
        tfCodigo.clear();
        Lanchonete.trocaTela("telaProduto");
    }
    
}
