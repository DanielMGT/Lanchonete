/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ProdutoController;
import Model.Pedido;
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
public class TelaCadastroPedidoControllerView implements Initializable {

    @FXML
    private Button btVoltar;
    
    @FXML
    private TextField tfDesc;

    @FXML
    private Label lbNFiscal;
    
    @FXML
    private TextField tfCode;

    @FXML
    private TextField tfPreco;

    @FXML
    private Label lbPreco;

    @FXML
    private Label lbCode;

    @FXML
    private Label lbDesc;

    @FXML
    private Label lbPedido;

    @FXML
    private TextField tfNFiscal;
    ProdutoModel produto;
    Pedido pedido;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    public void cadastrarPedido(){
        String cod = tfCode.getText();
        String p = tfPreco.getText();
        Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
        if (ProdutoController.produtoExiste(Double.parseDouble(cod))){
            produto = new ProdutoModel(Double.parseDouble(cod), tfDesc.getText(), Double.parseDouble(p));                   
            dialogoInfo.setTitle("AVISO");
            dialogoInfo.setHeaderText("Seu pedido foi registrado!");
            dialogoInfo.showAndWait();
        }
        else {
            dialogoInfo.setTitle("AVISO");
            dialogoInfo.setHeaderText("Esse produto não consta nos pedidos!");
            dialogoInfo.showAndWait();                       
        }
        tfDesc.clear();
        tfCode.clear();
        tfPreco.clear();
        
        Lanchonete.trocaTela("telaPedido");
    }
    public void cancelar(){
        tfDesc.clear();
        tfCode.clear();
        tfPreco.clear();
        tfNFiscal.clear();
        
        Lanchonete.trocaTela("telaPedido");
    }
    
}
