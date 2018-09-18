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

/**
 *
 * @author danie
 */
public class TelaCadastroProdutoControllerView implements Initializable{

    @FXML
    private Label lbFornecedor;

    @FXML
    private TextField tfCodigo;

    @FXML
    private TextField tfValor;

    @FXML
    private TextField tfFornecedor;

    @FXML
    private Label lbprodutos;

    @FXML
    private Label lbNome;

    @FXML
    private Label lbValor;

    @FXML
    private Button btCadastrar;

    @FXML
    private Label lbCodigo;

    @FXML
    private Button btCancelar;

    @FXML
    private TextField tfNome;
    
    ProdutoModel prod;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    public void cadastrarProd (){   
        Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
        String cd = tfCodigo.getText();
        if (!ProdutoController.produtoExiste(Double.parseDouble(cd)) == true){
            String valor = tfValor.getText();  
            String code = tfCodigo.getText();
            prod = new ProdutoModel();
            prod.setNome(tfNome.getText());
            prod.setCodigo(Double.parseDouble(code));
            prod.setValor(Double.parseDouble(valor));
            prod.setFornecedor(tfFornecedor.getText());
            ProdutoController.cadastrarProduto(prod);
        
            dialogoInfo.setTitle("AVISO");
            dialogoInfo.setHeaderText("Produto cadastrado com sucesso!");
            dialogoInfo.showAndWait();
            
        }
        else {
            dialogoInfo.setTitle("AVISO");
            dialogoInfo.setHeaderText("Produto já consta no cadastro!");
            dialogoInfo.showAndWait();                  
        }
            tfNome.clear();
            tfCodigo.clear();
            tfValor.clear();
            tfFornecedor.clear();
            
        Lanchonete.trocaTela("telaProduto");
    }
    public void cancelar(){
        tfNome.clear();
        tfValor.clear();
        tfCodigo.clear();
        tfFornecedor.clear();
        Lanchonete.trocaTela("telaProduto");
    }
}
