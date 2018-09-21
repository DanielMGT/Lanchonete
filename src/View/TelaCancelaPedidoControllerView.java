/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.PedidoController;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author danie
 */
public class TelaCancelaPedidoControllerView {
    
    @FXML
    private TextField tfCod;

    @FXML
    private Button remPedido;

    @FXML
    private Label lbDesc;

    @FXML
    private Label lbCancelPed;
    
    @FXML
    private Button btVoltar;
    
    public void removerPedido(){
        Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
        String can = tfCod.getText();
        if(!PedidoController.produtoExiste(Double.parseDouble(can))){           
            PedidoController.removerPedido(can);
            dialogoInfo.setTitle("AVISO");
            dialogoInfo.setHeaderText("Pedido removido com sucesso!");
            dialogoInfo.showAndWait();            
        }
        else {
            dialogoInfo.setTitle("AVISO");
            dialogoInfo.setHeaderText("Pedido não cadastrado!");
            dialogoInfo.showAndWait();
        }
        tfCod.clear();
        Lanchonete.trocaTela("telaPedido");
    }
    public void cancelar(){
        tfCod.clear();
        Lanchonete.trocaTela("telaPedido");
    }
}
