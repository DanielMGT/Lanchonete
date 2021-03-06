/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ProdutoController;
import Model.ProdutoModel;
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
public class TelaAlteraProdutoControllerView implements Initializable {

     @FXML
    private TextField tfAltCodigo;
     
    @FXML
    private Label lbAltCodigo;
    
     @FXML
    private TextField tfAltForn;

    @FXML
    private Label lbAltprod;

    @FXML
    private Label lbAltValor;

    @FXML
    private Button btAlterar;

    @FXML
    private TextField tfAltValor;

    @FXML
    private Label lbAltForn;

    @FXML
    private Button btCancelar;
       
    ProdutoModel produto;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    public void alterarProd (){
        String valor = tfAltValor.getText();
        String c = tfAltCodigo.getText();
        Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
        if (ProdutoController.produtoExiste(Double.parseDouble(c))){
            produto.setCodigo(Double.parseDouble(c));
            produto.setFornecedor(tfAltForn.getText());
            produto.setPreco(Double.parseDouble(valor));
            ProdutoController.alterarProduto(produto);
            dialogoInfo.setTitle("AVISO");
            dialogoInfo.setHeaderText("Produto alterado com sucesso!");
            dialogoInfo.showAndWait();           
        }
        else {
            dialogoInfo.setTitle("AVISO");
            dialogoInfo.setHeaderText("Produto não cadastrado!");
            dialogoInfo.showAndWait();
        }
        tfAltValor.clear();
        tfAltForn.clear();
        Lanchonete.trocaTela("telaProduto");
        
    }
    public void cancelar(){
        tfAltValor.clear();
        tfAltForn.clear();
        Lanchonete.trocaTela("telaProduto");
    }
    
}
