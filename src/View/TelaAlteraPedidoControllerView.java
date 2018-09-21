/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.PedidoController;
import Model.ProdutoModel;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author danie
 */
public class TelaAlteraPedidoControllerView {
    
    @FXML
    private TextField tfSeuPedido;

    @FXML
    private Label lbAltPedido;

    @FXML
    private TextField tfAltNFiscal;

    @FXML
    private TextField tfAltCodigo;

    @FXML
    private Label lbAltCodigo;

    @FXML
    private Label lbAltPreco;

    @FXML
    private Label lbSeuPedido;

    @FXML
    private Label lbAltNFiscal;

    @FXML
    private TextField tfAltPreco;
    
    @FXML
    private Button btAlterar;
    
    ProdutoModel prod;
    
    public void alterarPed(){
        Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
        String ped = tfSeuPedido.getText();
        if(!PedidoController.produtoExiste(Double.parseDouble(ped))){
            String cod = tfAltCodigo.getText();
            String p = tfAltPreco.getText();
            prod = new ProdutoModel(Double.parseDouble(cod), tfSeuPedido.getText(), Double.parseDouble(p));
            PedidoController.alterarPedido(prod);
            dialogoInfo.setTitle("AVISO");
            dialogoInfo.setHeaderText("Pedido alterado com sucesso!");
            dialogoInfo.showAndWait();
        }
        else {
            dialogoInfo.setTitle("AVISO");
            dialogoInfo.setHeaderText("Esse produto não consta nos pedidos!");
            dialogoInfo.showAndWait();
        }
        tfSeuPedido.clear();
        tfAltCodigo.clear();
        tfAltPreco.clear();
        
        Lanchonete.trocaTela("telaPedido");
    }
    public void cancelar(){
        tfSeuPedido.clear();
        tfAltCodigo.clear();
        tfAltPreco.clear();
        Lanchonete.trocaTela("telaPedido");
    }
}
