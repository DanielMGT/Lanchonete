/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.ProdutoModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author danie
 */
public class TelaCadastroProdutoControllerView implements Initializable{

    @FXML
    private Text lbFornecedor;

    @FXML
    private TextField tfCodigo;

    @FXML
    private TextField tfValor;

    @FXML
    private TextField tfFornecedor;

    @FXML
    private Label lbprodutos;

    @FXML
    private Text lbNome;

    @FXML
    private Text lbValor;

    @FXML
    private Button btCadastrar;

    @FXML
    private Text lbCodigo;

    @FXML
    private Button btCancelar;

    @FXML
    private TextField tfNome;
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void cadastrarProd (){
        String valor = tfValor.getText();
        ProdutoModel prod = new ProdutoModel();
        prod.setNome(tfNome.getText());
        prod.setCodigo(tfCodigo.getText());
        prod.setValor(Double.parseDouble(valor));
        prod.setFornecedor(tfFornecedor.getText());
    }
    public void cancelar(){
        tfNome.clear();
        tfValor.clear();
        tfCodigo.clear();
        tfFornecedor.clear();
        Lanchonete.trocaTela("telaProduto");
    }
}
